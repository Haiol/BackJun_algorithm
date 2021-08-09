class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(String s: skill_trees){
            if(canSkill(skill,s))answer++;
        }
        return answer;
    }
    public boolean canSkill(String skill, String tree){
        int k=0;
        for(int i=0;i<tree.length();i++){
            for(int j=0;j<skill.length();j++){
                if(tree.charAt(i)==skill.charAt(j)){
                    if(tree.charAt(i)!=skill.charAt(k++))return false;
                }
            }
        }
        return true;
    }
}
