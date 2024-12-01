package org.mapledpmlab.type.skill.buffskill.bishop;

import lombok.Getter;
import lombok.Setter;
import org.mapledpmlab.type.skill.buffskill.BuffSkill;

@Getter
@Setter
public class PrayParty5 extends BuffSkill {
    public PrayParty5(Long mainStat) {
        this.setName("프레이(2분, 5인팟)");
        this.setCooldown(180.0);
        this.setDuration(60L);
        this.setDelay(360L);
        this.setApplyServerLag(true);
        this.setPartyBuff(true);
        this.setBuffFinalDamage(1.07);
        /*if (mainStat >= 81000) {
            this.setBuffFinalDamage(1.07);
        } else if (mainStat == 0) {
            this.setBuffFinalDamage(1.0);
        } else {
            this.setBuffFinalDamage(1.0 + Math.abs((6 + mainStat / 3000) / 5) * 0.01);
        }*/
    }
}
