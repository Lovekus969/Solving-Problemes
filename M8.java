public class M8{

    // Attributes representing car parts status
    boolean grillInstalled = false;
    boolean radiatorInstalled = false;
    boolean turboVentsInstalled = false;
    
    int currentRPM = 0;
    boolean isEngineOn = false;
    
    // Install front grill
    public void installGrill() {
        grillInstalled = true;
        System.out.println("✅ Front grill installed: Wide Mesh Intake active.");
    }
    
    // Install radiator
    public void installRadiator() {
        radiatorInstalled = true;
        System.out.println("✅ Radiator installed: High-flow Cooling Grid active.");
    }
    
    // Install turbo vents
    public void installTurboVents() {
        turboVentsInstalled = true;
        System.out.println("✅ Twin turbo vents installed: Turbo cooling optimized.");
    }
    
    // Start engine
    public void startEngine() {
        if (grillInstalled && radiatorInstalled && turboVentsInstalled) {
            isEngineOn = true;
            currentRPM = 1000;  // idle rpm
            System.out.println("🚀 Engine started. RPM at " + currentRPM);
        } else {
            System.out.println("⚠️ Can't start engine. Make sure all components are installed!");
        }
    }
    
    // Increase RPM
    public void increaseRPM(int increment) {
        if (isEngineOn) {
            currentRPM += increment;
            System.out.println("⬆️ RPM increased to " + currentRPM);
        } else {
            System.out.println("⚠️ Engine is off. Start the engine first.");
        }
    }
    
    // Decrease RPM
    public void decreaseRPM(int decrement) {
        if (isEngineOn && currentRPM - decrement >= 0) {
            currentRPM -= decrement;
            System.out.println("⬇️ RPM decreased to " + currentRPM);
        } else if (!isEngineOn) {
            System.out.println("⚠️ Engine is off. Start the engine first.");
        } else {
            System.out.println("⚠️ RPM can't go below 0.");
        }
    }
    
    // Honk horn
    public void honk() {
        System.out.println("📢 Honk! Honk! M8 COMP alert!");
    }
    
    // Stop engine
    public void stopEngine() {
        if (isEngineOn) {
            currentRPM = 0;
            isEngineOn = false;
            System.out.println("🛑 Engine stopped.");
        } else {
            System.out.println("⚠️ Engine is already off.");
        }
    }


            public static void main(String[] args) {
                M8 myM8 = new M8();
                
                // Install parts
                myM8.installGrill();
                myM8.installRadiator();
                myM8.installTurboVents();
                
                // Start engine
                myM8.startEngine();
                
                // Play with RPMs
                myM8.increaseRPM(1500);
                myM8.increaseRPM(2500);
                myM8.decreaseRPM(1000);
                
                // Honk horn
                myM8.honk();
                
                // Stop engine
                myM8.stopEngine();
            }
  }
