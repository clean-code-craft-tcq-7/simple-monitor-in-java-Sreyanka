package vitals;

public class BatteryControl{
  
  public boolean isBatteryParameterWithinLimits(float parameter,float minLimit, float maxLimit)
  {
    return parameter >= minLimit && parameter <= maxLimit;
  }
  
  public boolean isTemperatureinValidRange(float temperature)
  {
    return (isBatteryParameterWithinLimits(temperature,BatteryConstants.MinTemperature,BatteryConstants.MaxTemperature));
  }
  
   public boolean isSOCinValidRange(float soc)
  {
    return (isBatteryParameterWithinLimits(soc,BatteryConstants.MinSoc,BatteryConstants.MaxSoc));
  }
         
  public boolean isChargeRateinValidRange(float chargeRate)
   {
      return (chargeRate <= BatteryConstants.MaxChargeRate);
   }
            
   public boolean batteryIsOk(float temperature, float soc, float chargeRate) {
     return (isTemperatureinValidRange(temperature) && isSOCinValidRange(soc) && isChargeRateinValidRange(chargeRate));
   }
}
