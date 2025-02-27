package org.mapledpmlab.type.skill.attackskill.captain;

import org.mapledpmlab.type.skill.attackskill.AttackSkill;

public class MarksmanCrew extends AttackSkill {
    public MarksmanCrew() {
        this.setName("명사수 크루");
        this.setAttackCount(4L);
        this.setDamage(468.0);
        this.setDotDuration(120000L);
        this.setInterval(3030L);
        this.addFinalDamage(2.2);       // 코어 강화
        this.addIgnoreDefenseList(20L);
    }
}
