package com.sun.javaee.blueprints.petstore.model;
import javax.faces.context.FacesContext;
import java.util.Map;

/**
 *
 * @author basler
 */
public class RatingBean {

    private String itemId = null;
    private int grade = 0;
    private CatalogFacade cf;

    /** Creates a new instance of RatingBean */
    public RatingBean() {
        FacesContext context=FacesContext.getCurrentInstance();
        Map<String,Object> contextMap=context.getExternalContext().getApplicationMap();
        cf=(CatalogFacade)contextMap.get("CatalogFacade");
    }

    public String[] getRatingText() {
        return new String[]{"Hate It", "Below Average", "Average", "Above Average", "Love It"};
    }

    public void setGrade(int grade) {
        // "itemId" is the primarykey for the product...
        // "grade" is the grade to be store
        String itemId = getItemId();
        if(itemId != null) {
            if(grade>=1){
                //call the catalog facade to update rating
                Item item = cf.getItem(itemId);
                item.addRating(grade);
                cf.updateItem(item);
            }
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setItemId(String itemId) {
        this.itemId=itemId;
    }

    public String getItemId() {
        return itemId;
    }
}
