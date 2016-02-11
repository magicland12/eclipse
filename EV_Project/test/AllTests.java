/**
 * 
 */
package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author user
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ Activities.class, Branch_List.class, Dashboard.class, Dashboard_Activities.class, ELibrary_Media.class,
		Firm_List.class, Firm_Overview.class, Global_Search.class, Menu.class, Nearby_Reps.class, Rep_list.class,
		Rep_Overview.class, Rep_Overview_Actions.class, SearchWithinFirms.class })
public class AllTests {

}
