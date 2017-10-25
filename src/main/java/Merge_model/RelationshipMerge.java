package Merge_model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thomas.palyska on 25.10.2017.
 */
public class RelationshipMerge {
    ArrayList<MRelationship> l_mr= new ArrayList<MRelationship>();

    public RelationshipMerge() {

        MRelationship r1= new MRelationship(false,"If the bundle cannot be created, all FlowFiles that would have been used to created the bundle will be transferred to failure","failure");
        MRelationship r2= new MRelationship(false,"The FlowFile containing the merged content","merged");
        MRelationship r3= new MRelationship(true,"The FlowFiles that were used to create the bundle","original");
        this.l_mr.add(r1);
        this.l_mr.add(r2);
        this.l_mr.add(r3);


    }

    public ArrayList<MRelationship> getL_mr() {
        return l_mr;
    }
}
