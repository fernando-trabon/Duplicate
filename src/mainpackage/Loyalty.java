/**
 * 
 */
package mainpackage;

/**
 * @author Kraun
 * @version 1.0
 * 
 */
public interface Loyalty {
	double PENSION_BONUS = 0.5;
	double OLD_CLIENT_BONUS = 0.25;
	String REGULAR_CLIENT_DEPOSIT_NAME = "Strokovyu";
	String PENSION_DEPOSIT_NAME = "Strokovyu_Pensiynyu";
	String OLD_CLIENT_DEPOSIT_NAME = "Strokovyu_Nadiynuy_Klient";
	String REGULAR_CLIENT_ACCUM_DEPOSIT_NAME = "Nakopuchyvalnyy";
	String PENSION_ACCUM_DEPOSIT_NAME = "Nakopuchyvalnyy_Pensiynyu";
	String OLD_CLIENT_ACCUM_DEPOSIT_NAME = "Nakopuchyvalnyy_Nadiynuy_Klient";

	double setPensionBonus(double percent);

	double setOldClientBonus(double percent);
}
