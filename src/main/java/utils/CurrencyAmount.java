package utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Getter
@AllArgsConstructor
public class CurrencyAmount {

  private final int pounds;
  @Max(19)
  @Min(0)

  private final int shillings;
  @Max(11)
  @Min(0)

  private final int pennies;
  private int rest;


  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(
        String.format("%sp %ss %sd", pounds, shillings, pennies));

    if (rest != 0) {
      stringBuilder.append(String.format(" - %sa", rest));
    }

    return stringBuilder.toString();
  }
}
