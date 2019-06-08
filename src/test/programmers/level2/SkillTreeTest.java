package test.programmers.level2;

import org.junit.Test;
import programmers.level2.SkillTree;

import static org.junit.Assert.*;

public class SkillTreeTest extends SkillTree {
    @Test
    public void testSkillTree(){
        String skill = "ADF";
//        String[] skill_trees = {"AB","ADKF","BADF","QWAERTBYCUDIOP"};
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
//        String[] skill_trees = {"ABEDF", "XAFZYBCOQ", "ZXDVMABCDE", "BDA"};
//        String[] skill_trees = {"XAFZYBCOQ"};

        int result = solution(skill, skill_trees);

        assertEquals(result, 4);
    }

}