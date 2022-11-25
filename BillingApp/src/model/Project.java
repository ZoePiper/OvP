package model;
/*@ZoePiper
This class describes a project with a name and type
 */

public class Project implements Rateable{

        private Rateability rateability;
        private Rate rate;

    //constructor


    public Project(Rateability rateability, Rate rate) {
        this.rateability = rateability;
        this.rate = rate;
    }

    @Override
    public String Rating() {
        return rateability.Rate();
    }

    //get Description
    //get price

}
