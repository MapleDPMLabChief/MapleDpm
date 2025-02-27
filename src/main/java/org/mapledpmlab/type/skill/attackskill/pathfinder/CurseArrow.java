package org.mapledpmlab.type.skill.attackskill.pathfinder;

import org.mapledpmlab.type.skill.attackskill.AttackSkill;

public class CurseArrow extends AttackSkill {
    public CurseArrow() {
        this.setName("에디셔널 블래스트(저주 화살)");
        this.setAttackCount(4L);
        this.setDamage(180.0);
        this.setDotDuration(20000L);
        this.setInterval(100L);
        this.setLimitAttackCount(16L);
        this.addFinalDamage(2.2);       // 코어강화
        this.addIgnoreDefenseList(20L);
        this.setCooldown(20.0);
    }
}
