package org.mapledpmlab.type.skill.attackskill.paladin;

import org.mapledpmlab.type.skill.attackskill.AttackSkill;

public class MightyMjolnirDelay extends AttackSkill {
    public MightyMjolnirDelay() {
        this.setName("마이티 묠니르");
        this.setDelayByAttackSpeed(840L);
        this.setCooldown(36.0);
        this.setApplyCooldownReduction(false);
    }
}
