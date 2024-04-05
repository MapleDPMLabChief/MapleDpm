package org.mapledpmlab.type.skill.attackskill.hoyoung;

import org.mapledpmlab.type.skill.attackskill.AttackSkill;

public class EarthquakeChainFalseTrue extends AttackSkill {
    public EarthquakeChainFalseTrue() {
        this.setName("지진쇄 : 허/실");
        this.setDamage(650.0 + 250);
        this.setDelayByAttackSpeed(450L);
        this.setAttackCount(6L);
        this.setAddDamage(10L + 15);    // 천지인-리인포스
        this.addFinalDamage(2.2);   // 코어강화
        this.addIgnoreDefenseList(20L);
    }
}
