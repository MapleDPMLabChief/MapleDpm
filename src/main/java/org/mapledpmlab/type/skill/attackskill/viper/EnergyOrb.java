package org.mapledpmlab.type.skill.attackskill.viper;

import org.mapledpmlab.type.skill.attackskill.AttackSkill;

public class EnergyOrb extends AttackSkill {
    public EnergyOrb() {
        this.setName("에너지 오브");
        this.setAttackCount(10L);
        this.setDamage(1150.0);
        this.setDelayByAttackSpeed(1080L);
        this.setDotDuration(1680L);
        this.setInterval(120L);
        this.setLimitAttackCount(14L);
        this.addIgnoreDefenseList(50L);
        this.addFinalDamage(1.6);
    }
}
