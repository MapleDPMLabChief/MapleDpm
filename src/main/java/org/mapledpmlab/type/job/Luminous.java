package org.mapledpmlab.type.job;

import org.mapledpmlab.type.ability.BuffBossAbnormal;
import org.mapledpmlab.type.etc.JobType;
import org.mapledpmlab.type.farm.BuffFarm;
import org.mapledpmlab.type.link.HybridLogic;
import org.mapledpmlab.type.link.PhantomInstinct;
import org.mapledpmlab.type.union.IntUnion;

public class Luminous extends Job {

    public Luminous() {
        // 기본
        super();
        this.setDescription("루미너스");
        this.setConstant(1.2);          // 무기상수
        this.setMastery(1.96 / 2);      // 숙련도
        this.setJobType(JobType.ETC);
        this.addObject(new BuffBossAbnormal());
        this.addObject(new BuffFarm());
        this.addObject(new HybridLogic());
        this.addObject(new PhantomInstinct());
        this.addObject(new IntUnion());
        this.addPerXMainStat(20L);

        // 무기
        this.addMainStat((long) (150 + 32 + 145));
        this.addSubStat((long) (150 + 145));
        this.addMagic((long) (400 + 246 + 72 + 274));
        this.setWeaponAttMagic((long) (400 + 246 + 72 + 274));
        this.addBossDamage((long) (30 + 10));
        this.addIgnoreDefenseList(20L);
        this.addBossDamage(70L);
        this.addMagicP(9L);
        this.addMagicP(21L);
        this.addMagicP(3L);

        // 보조
        this.addBossDamage(70L);
        this.addMagicP(9L);
        this.addMagicP(21L);

        // 0차
        this.addMainStat(20L);          // 파워 오브 라이트

        // 2차
        this.addMagic(30L);             // 블레스 오브 다크니스
        this.addMainStat(20L);          // 매직 액셀레이션
        this.addMainStat(40L);          // 하이 위즈덤
        this.addCriticalP(20.0);        // 스펠 마스터리
        this.addDamage(15L);
        this.addMagic(10L);

        // 3차
        this.addMagic(40L);             // 포틱 메디테이션

        // 4차
        this.addFinalDamage(1.37);      // 모닝 스타폴
        this.addBossDamage(15L);
        this.addProperty(10L);          // 다크니스 소서리
        this.addFinalDamage(1.41);
        this.addIgnoreDefenseList(41L);
        this.addMagic(31L);             // 매직 마스터리
        this.addCriticalDamage(18.0);
        this.addCriticalP(15.0);
    }

    public Long getStatDamage() {
        return (long) Math.floor(
                (this.getFinalMainStat() * 4 + getFinalSubstat()) * 0.01
                        * Math.floor(this.getMagic() * (1 + this.getMagicP() * 0.01))
                        * this.getConstant()
                        * (1 + this.getDamage() * 0.01)
                        * this.getFinalDamage()
        );
    }
}
