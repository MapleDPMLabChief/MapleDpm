package org.mapledpmlab.type.skill.attackskill.marksman;

import org.mapledpmlab.type.skill.attackskill.AttackSkill;

public class RepeatingCrossbowCartridge extends AttackSkill {
    public RepeatingCrossbowCartridge() {
        this.setName("리피팅 크로스보우 카트리지");
        this.setAttackCount(10L);       // 어디셔널 볼트
        this.setDamage(825.0);
        this.setDotDuration(810L);
        this.setLimitAttackCount(4L);
        this.setInterval(202L);
        this.addFinalDamage(1.6);       // 코어 강화
        this.setRelatedSkill(new RepeatingCrossbowCartridgeDelay());
    }
}
