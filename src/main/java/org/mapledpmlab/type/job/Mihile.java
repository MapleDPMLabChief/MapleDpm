package org.mapledpmlab.type.job;

import org.mapledpmlab.type.ability.BossAbnormalReuse;
import org.mapledpmlab.type.etc.JobType;
import org.mapledpmlab.type.farm.ReuseFarm;
import org.mapledpmlab.type.link.HybridLogic;
import org.mapledpmlab.type.union.StrUnion;

public class Mihile extends Job {
    private Long subStat = 4L;

    public Mihile() {
        // 기본
        super();
        this.setDescription("미하일");
        this.setConstant(1.24);         // 무기상수
        this.setMastery(1.91 / 2);      // 숙련도
        this.setJobType(JobType.COOLDOWN_REDUCTION2);
        this.addObject(new BossAbnormalReuse());
        this.addObject(new ReuseFarm());
        this.addObject(new HybridLogic());
        this.addObject(new StrUnion());

        // 무기
        this.addMainStat((long) (150 + 32 + 145));
        this.addSubStat((long) (150 + 145));
        this.addAtt((long) (326 + 201 + 72 + 249));
        this.setWeaponAttMagic((long) (326 + 201 + 72 + 249));
        this.addBossDamage((long) (30 + 10));
        this.addIgnoreDefenseList(20L);
        this.addBossDamage(70L);
        this.addAttP(9L);
        this.addAttP(21L);
        this.addAttP(3L);

        // 보조
        this.addMainStat(21L);
        this.addSubStat(21L);
        this.addBossDamage(70L);
        this.addAttP(9L);
        this.addAttP(21L);

        // 0차
        this.addAttP(10L);              // 엘리멘탈 엑스퍼트
        this.addMagicP(10L);

        // 1차
        this.addCriticalP(10.0);        // 소울 어택

        // 2차
        this.addAtt(30L);               // 인커리지
        this.addMainStat(20L);          // 소드 액셀레이션
        this.addAtt(20L);               // 소드 마스터리
        this.addFinalDamage(1.15);
        this.addMainStat(30L);          // 피지컬 트레이닝
        this.addSubStat(30L);

        // 3차
        this.addMainStat(60L);          // 로얄 오쓰
        this.addCriticalP(20.0);
        this.addFinalDamage(1.23);
        this.addCriticalP(10.0);        // 어드밴스드 소울 어택

        // 4차
        this.addFinalDamage(1.26);      // 소울 레이지
        this.addCriticalDamage(10.0);
        this.addAtt(31L);               // 어드밴스드 소드 마스터리
        this.addCriticalP(15.0);
        this.addCriticalDamage(15.0);
        this.addAtt(31L);               // 어드밴스드 파이널 어택
        this.addIgnoreDefenseList(42L);  // 컴뱃 마스터리

        // 5차
        this.addMainStat(30L);          // 바디 오브 스틸
    }
}
