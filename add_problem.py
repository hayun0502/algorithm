import re, os

# 사용자 입력
platform = input("플랫폼 (Programmers/BOJ/LeetCode): ").strip()
problem = input("문제 이름: ").strip()
level = input("레벨 (예: Lv.1, Silver 4, Easy): ").strip()
link = input("문제 링크: ").strip()
category = input("분류 (예: 구현, 문자열, DFS/BFS, 스택/큐, DP, 정렬): ").strip()

readme_path = "README.md"
with open(readme_path, "r", encoding="utf-8") as f:
    content = f.read()

#######################################
# 1) 🔗 Problem Links 테이블 업데이트  #
#######################################

# 아이디어:
# - "## 🔗 Problem Links" 라인부터 시작
# - 그 다음에 나오는 표 라인들만 따로 잡는다 (파이프 | 로 시작하는 줄들)
# - 안내문 `> 💡 ...` 나오기 전까지만 테이블로 간주한다

problem_links_section_pattern = r"(## 🔗 Problem Links\s*\n)([\s\S]*?)\n(?=>|\Z)"
m = re.search(problem_links_section_pattern, content)

if m:
    section_header = m.group(1)   # "## 🔗 Problem Links\n"
    table_block = m.group(2)      # 표 라인들만 (| ...)

    # 표를 줄 단위로 나눔
    lines = table_block.strip().splitlines()

    # 새로 추가할 문제 줄
    new_row = f"| {platform} | {problem} | {level} | [바로가기]({link}) |"

    # 현재 lines 예시:
    # 0: | 플랫폼 | 문제 | 레벨 | 링크 |
    # 1: |---------|------|------|------|
    # 2: | Programmers | 자릿수더하기 | Lv.1 | [바로가기](...) |
    #
    # → 그냥 맨 끝에 new_row append하면 됨
    lines.append(new_row)

    # 다시 합쳐
    new_table_block = "\n".join(lines)

    # content에서 기존 섹션을 새로운 섹션으로 교체
    content = (
        content[:m.start(1)]
        + section_header
        + new_table_block
        + content[m.end(2):]  # table_block 이후부터 그대로 유지 (💡 안내문 포함)
    )
else:
    print("⚠️ Problem Links 섹션을 못 찾았습니다. README 형식을 확인하세요.")


########################################
# 2) 🧮 Solved Topics 카테고리 +1      #
########################################

topics_pattern = rf"(\| {re.escape(category)} \|\s+)(\d+)(\s+\|)"
match_topics = re.search(topics_pattern, content)

if match_topics:
    old_num = int(match_topics.group(2))
    new_num = old_num + 1
    content = re.sub(
        topics_pattern,
        rf"\g<1>{new_num}\g<3>",
        content
    )
    print(f"✅ '{category}' 문제 수 {old_num} → {new_num}")
else:
    print(f"⚠️ '{category}' 카테고리를 찾을 수 없습니다. (Solved Topics 표에서 이름 정확히 같아야 함)")


########################################
# 3) README 저장 + git push            #
########################################

with open(readme_path, "w", encoding="utf-8") as f:
    f.write(content)

commit_msg = f'docs: add {problem} ({platform}) and update {category} count'
os.system('git add README.md')
os.system(f'git commit -m "{commit_msg}"')
os.system('git push')

print("🚀 README 업데이트 및 push 완료!")
