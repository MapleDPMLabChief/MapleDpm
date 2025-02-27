package org.mapledpmlab.type.union;

public class LuminousUnion extends Union {

    public LuminousUnion() {
        super();
        this.setDescription("유니온 공격대 점령효과" +
                "\n1.크리티컬 데미지 20%" +        // 40
                "\n2.보스 공격 시 데미지 40%" +     // 40
                "\n3.몬스터 방어율 무시 40%" +      // 40
                "\n4.버프 지속시간 40%" +         // 30
                "\n5.공격력/마력 5" +            // 15
                "\n6.주스탯 25" +              // 5
                "\n7.부스탯 5" +               // 1
                "\n\n유니온 공격대원 효과" +
                "\n1.블래스터 250 : 몬스터 방어율 무시 6%" +
                "\n2.데몬 어벤져 250 : 보스 공격 시 데미지 6%" +
                "\n3.신궁 250 : 크리티컬 확률 5%" +
                "\n4.메르세데스 250 : 스킬 재사용 대기시간 감소 6%" +
                "\n5.와일드헌터 250 : 데미지 4%(공격시 20% 확률로 데미지 20% 증가)" +
                "\n6.나이트로드 250 : 크리티컬 확률 5%" +
                "\n7.은월 250 : 크리티컬 데미지 6%" +
                "\n8.메카닉 250 : 버프 지속시간 25%" +
                "\n9.메이플스토리M : 공격력/마력 20" +
                "\n10.소울마스터 200 : HP 2000" +
                "\n11.미하일 200 : HP 2000" +
                "\n12.%미적용 주스탯 : 640" +
                "\n13.%미적용 부스탯 : 520"
        );
        //this.addAtt(10L);       // 10
        //this.addMagic(10L);

        this.addPerXMainStat(640L);
        this.addPerXSubStat(480L);
        this.addPerXSubStat(40L);
        this.addPlusBuffDuration(-10L);
    }
}
