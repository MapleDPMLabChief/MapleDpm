package org.mapledpmlab.type.skill.attackskill.lara;

import org.mapledpmlab.type.skill.attackskill.AttackSkill;

public class EruptionRipplingRiverBig extends AttackSkill {
    public EruptionRipplingRiverBig() {
        this.setName("분출 : 너울이는 강(큰 너울)");
        this.setDamage(1320.0);
        this.setAttackCount(8L);
        this.addFinalDamage(1.2);           // 용맥 흡수 VI
        this.addFinalDamage(1.15);      // 잠 깨우기 VI
        this.addFinalDamage(2.2);   // 코어강화
        this.addIgnoreDefenseList(20L);
        this.addFinalDamage(1.08);      // 오버로드 마나
        this.getMultiAttackInfo().add(5530L);
        this.getMultiAttackInfo().add(11890L - 5530);
        this.getMultiAttackInfo().add(17250L - 11890);
        this.setAddDamage(10L + 15 + 21);   // 분출/흡수 - 리인포스, 보스 킬러
    }
}
