package org.mapledpmlab.type.equipment;

import lombok.Getter;
import lombok.Setter;
import org.mapledpmlab.type.etc.JobType;

@Getter
@Setter
public class Ring2 extends Item {

    public Ring2(JobType jobType) {
        super(jobType, 160L);
        this.addMainStat(5L);
        this.addSubStat(5L);
        this.addOtherStat1(5L);
        this.addOtherStat2(5L);
        this.addAtt(2L);
        this.addMagic(2L);
        this.addHp(200L / 2);
        if (jobType == JobType.DEMON_AVENGER) {
            this.addHp((long) (250 * 3) / 2);
        } else if (jobType == JobType.XENON) {
            this.addMainStat((long) (3 * 3));
            this.addSubStat((long) (3 * 3));
            this.addOtherStat1((long) (3 * 3));
            this.addOtherStat2((long) (3 * 3));
        } else  {
            this.addMainStat((long) (5 * 3));
        }
    }
}
