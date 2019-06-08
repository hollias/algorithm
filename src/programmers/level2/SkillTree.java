package programmers.level2;

public class SkillTree {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(int i=0; i < skill_trees.length; i++){
            if(isRightSkillTree(skill, skill_trees[i])){
                answer++;
            }
        }
        return answer;
    }

    private boolean isRightSkillTree(String skill, String skill_tree){
        skill = skill.toUpperCase();
        skill_tree = skill_tree.toUpperCase();

        int preSkillNumber = -1;
        char[] skills = skill_tree.toCharArray();
        for(int i = 0; i < skills.length; i++){
            if(skill.indexOf(skills[i]) < 0){
                continue;
            }

            if(skill.indexOf(skills[i]) != preSkillNumber + 1 || (preSkillNumber == -1 && skill.indexOf(skills[i]) != 0)) {
                return false;
            }else{
                preSkillNumber = skill.indexOf(skills[i]);
            }
        }

        return true;
    }
}
