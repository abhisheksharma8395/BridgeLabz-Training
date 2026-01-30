package stream_api.filtering_expiring_membership;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GymMember {
    static List<GymMember> members = new ArrayList<>();        // Stores the all members of gym

    String memberName;                                    // Store the gym member name
    LocalDate memberShipExpireDate;                       // Stores the membership expire date

    // Constructor of GymMember to initializing instance variables
    public GymMember(String memberName,LocalDate memberShipExpireDate){
        this.memberName = memberName;
        this.memberShipExpireDate = memberShipExpireDate;
        members.add(this);
    }

    @Override
    public String toString(){
        return "Member Name : "+this.memberName+", Membership expire Date : "+this.memberShipExpireDate;
    }
}
