package model;
/*@ZoePiper
This class describes the quantity of hours worked on projects
 */
public class LineProject {
    //what does the Lineproject need to store?
    private Project project;
    private Material material;
    private int amount;


    //add material
    //add project
    // getTotalPrice Get the total of one line
    public double getTotalPrice(){
        return Material.getPrice() * amount;

    }
    // format line
    public String format(){

    }


}