package org.mapledpmlab.type.skill.buffskill.hero;

import lombok.Getter;
import lombok.Setter;
import org.mapledpmlab.type.skill.attackskill.hero.ComboInstinctsAttack;
import org.mapledpmlab.type.skill.buffskill.BuffSkill;

@Getter
@Setter
public class ComboInstinctsBuff extends BuffSkill {
    public ComboInstinctsBuff() {
        this.setName("콤보 인스팅트");
        this.setBuffAttMagic(4L);
        this.setBuffDamage(4L);
        this.setCooldown(120.0);
        this.setDelayByAttackSpeed(450L);
        this.setDuration(20L);
        this.setApplyServerLag(true);
    }
}
