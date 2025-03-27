class SirenRunner {  
    public static void main(String[] args) {  
        Siren  siren  = new Siren ();  
        System.out.println("Siren  soundType: " + siren.soundType);  
        System.out.println("Siren  volume: " + siren.volume);  
        System.out.println("Siren  powerSource: " + siren.powerSource);  
        System.out.println("Siren  isEmergencyUse: " + siren.isEmergencyUse);  

        Siren.soundType = "Yelp";  
        Siren.volume = "130 dB";  
        Siren.powerSource = "Electric";  
        Siren.isEmergencyUse = true;  

        System.out.println("Updated siren soundType: " + siren.soundType);  
        System.out.println("Updated volume: " + siren.volume);  
        System.out.println("Updated powerSource: " + siren.powerSource);  
        System.out.println("Updated isEmergencyUse: " + siren.isEmergencyUse);  
    }  
}