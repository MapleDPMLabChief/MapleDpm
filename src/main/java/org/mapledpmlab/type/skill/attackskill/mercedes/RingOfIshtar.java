package org.mapledpmlab.type.skill.attackskill.mercedes;

import org.mapledpmlab.type.skill.attackskill.AttackSkill;

public class RingOfIshtar extends AttackSkill {
    public RingOfIshtar() {
        this.setName("이슈타르의 링");
        this.setAttackCount(2L);
        this.setDamage(525.0 + 20);
        this.setDelay(120L);
        this.setAddDamage(20L + 20);        // 이슈타르의 링-리인포스, 보스 킬러
        this.addIgnoreDefenseList(20L);     // 이슈타르의 링-이그노어 가드
        this.addFinalDamage(2.2);           // 코어 강화
        this.addCriticalP(5.0);
        this.addIgnoreDefenseList(20L);
        this.setApplyFinalAttack(true);
    }
}
