package ocean_fleet;

import java.util.ArrayList;
import java.util.List;

public class VesselUtil {
    private List<Vessel> vesselList = new ArrayList<>();

    public void addVesselPerformance(Vessel vessel){
        this.vesselList.add(vessel);
    }

    public Vessel getVesselById(String vesselId){
        for(Vessel vessel : this.vesselList){
            if(vessel.getVesselId().equals(vesselId)){
                return vessel;
            }
        }
        return null;
    }

    public List<Vessel> getHighPerformanceVessels(){
        double highestAverageSpeed = 0.0;
        for(Vessel vessel : this.vesselList){
            if(highestAverageSpeed < vessel.getAverageSpeed()){
                highestAverageSpeed = vessel.getAverageSpeed();
            }
        }
        List<Vessel> vessels = new ArrayList<>();
        for(Vessel vessel : this.vesselList){
            if(vessel.getAverageSpeed() == highestAverageSpeed){
                vessels.add(vessel);
            }
        }
        return vessels;
    }
}
