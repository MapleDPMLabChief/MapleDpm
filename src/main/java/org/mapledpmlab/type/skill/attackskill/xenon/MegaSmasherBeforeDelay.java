package org.mapledpmlab.type.skill.attackskill.xenon;

import org.mapledpmlab.type.skill.attackskill.AttackSkill;

public class MegaSmasherBeforeDelay extends AttackSkill {
    public MegaSmasherBeforeDelay() {
        this.setName("메가 스매셔(선딜)");
        this.setDelay(600L);
        this.setRelatedSkill(new MegaSmasher());
    }
}
