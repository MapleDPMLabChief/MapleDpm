package org.mapledpmlab.type.skill.attackskill.cadena;

import org.mapledpmlab.type.skill.attackskill.AttackSkill;

public class SummonShootingShotgun extends AttackSkill {
    public SummonShootingShotgun() {
        this.setName("서먼 슈팅 샷건");
        this.setDamage(940.0);
        this.setAttackCount(7L);
        this.setDelay(150L + 30);
        this.setCooldown(5.0);
        this.addFinalDamage(1.3);           // 연계
        this.addFinalDamage(2.2);           // 코어강화
        this.addIgnoreDefenseList(20L);
        this.setAddDamage(20L + 20);        // 논체인아츠-리인포스, 보스 킬러
        this.setApplyReuse(true);
    }
}
