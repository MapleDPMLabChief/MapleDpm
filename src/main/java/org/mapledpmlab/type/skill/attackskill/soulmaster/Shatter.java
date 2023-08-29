package org.mapledpmlab.type.skill.attackskill.soulmaster;

import org.mapledpmlab.type.skill.attackskill.AttackSkill;

public class Shatter extends AttackSkill {
    public Shatter() {
        this.setName("균열");
        this.setAttackCount(6L * 2);
        this.setDamage(1150.0);
        this.setCooldown(5.0);
        this.setDotDuration(5L);
        this.setInterval(1L);
        this.setLimitAttackCount(5L);
        this.addFinalDamage(0.9);           // 마스터 오브 더 소드
        this.addFinalDamage(1.6);           // 코어강화
    }
}
