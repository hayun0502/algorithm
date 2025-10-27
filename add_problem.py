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

# ✅ Problem Links 섹션에 문제 추가
pattern_links = r"(?<=\| LeetCode \| Two Sum \| Easy \| \[바로가기\]\(https:\/\/leetcode\.com\/problems\/two-sum\/\) \|)"
insert_line = f"\n| {platform} | {problem} | {level} | [바로가기]({link}) |"
new_content = re.sub(pattern_links, pattern_links + insert_line, content)

# ✅ Solved Topics 섹션 숫자 자동 +1
pattern_topics = rf"(\| {category} \| )(\d+)( \|)"
match = re.search(pattern_topics, new_content)
if match:
    old_num = int(match.group(2))
    new_num = old_num + 1
    new_content = re.sub(pattern_topics, f"| {category} | {new_num} |", new_content)
    print(f"✅ '{category}' 문제 수가 {old_num} → {new_num} 로 업데이트됨!")
else:
    print(f"⚠️ '{category}' 항목을 찾을 수 없어 업데이트하지 못했습니다.")

# 저장
with open(readme_path, "w", encoding="utf-8") as f:
    f.write(new_content)

# git 자동 반영
os.system('git add README.md')
os.system(f'git commit -m "docs: add {problem} ({platform}) and update {category} count"')
os.system('git push')

print(f"🚀 {problem} 추가 및 GitHub 반영 완료!")
