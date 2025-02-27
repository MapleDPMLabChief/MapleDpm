package org.mapledpmlab.type.skill.attackskill.archmageil;

import org.mapledpmlab.type.skill.attackskill.AttackSkill;

public class ElquinesSummon extends AttackSkill {
    public ElquinesSummon() {
        this.setName("엘퀴네스");
        this.setDamage(230.0);
        this.setAttackCount(3L);
        this.setCooldown(265.0);
        this.setDelay(960L);
        this.setInterval(3000L);
        this.setDotDuration(260000L);
        this.addFinalDamage(2.2);       // 코어강화
        this.addIgnoreDefenseList(20L);
        this.setAddDamage(-40L);        // 아케인 에임 소환수 미적용
        this.addFinalDamage(1.08);          // 오버로드 마나
    }
}
