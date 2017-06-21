/**
 * 
 */
package com.weather.utils;

/**
 * @author rohit.patel
 *
 */
public interface Constants {

	String CONFIG_FILEPATH = "/config.json";
	
	String CAMPAIGN_COLLECTIONNAME = "campaign";
	String INACTIVE = "INACTIVE";
	String ACTIVE = "ACTIVE";
	String FAILURE = "FAILURE";
	String SUCCESS = "SUCCESS";
	
	String DAILY = "DAILY";
	String WEEKLY = "WEEKLY";
	String MONTHLY = "MONTHLY";
	
	String STARTED = "STARTED";
	String PAUSE = "PAUSE";
	String STOPPED = "STOPPED";
	String CSV_GENERATED = "CSV_GENERATED";
	String CSV_FAILED = "CSV_FAILED";
	
	String CAMPAIGN_NAME_EXIST_ALREADY = "Campaign name is already exist in the system. Please try another name.";
	String CAMPAIGN_CREATED = "#campaignname has been created successfully";
	String CAMPAIGN_FAILED = "Selected campaign operation has been failed due to system failure. Try again later";
	String CAMPAIGN_UPDATED = "#campaignname has been updated successfully";
	String CAMPAIGN_DELETED = "Selected campaign has been deleted successfully";
	
	String CATEGORY_CREATED = "category has been created successfully";
	String CATEGORY_FAILED = "category has been failed due to system failure. Try again later";
	
	String CAMPAIGN_ACTIVATED = "#campaignname has been activated successfully";
	String CAMPAIGN_INACTIVATED = "#campaignname has been inactivated successfully";
	
	String DLS_COLLECTION_NAME = "dls";
	String DATE = "DATE";
	String INTEGER = "INTEGER";
	String DOUBLE = "DOUBLE";
	String LONG = "LONG";
	
	String USER_NAME_EXIST_ALREADY = "#username is already exist in the system. Please try another name.";
	String USER_CREATED = "#username has been created successfully";
	String OPERATION_FAILED = "Operation has been failed due to system failure. Try again later";
	String USER_UPDATED = "#username has been updated successfully";
	String USER_DELETED = "User has been deleted successfully";
	
	String USER_AVAILABLE = "#username is available in system";
	String USER_NOTAVAILABLE = "#username is not available in system";
	
	String IDLE = "IDLE";
	String RUNNING = "RUNNING";
	String EXECUTED = "EXECUTED";
	
	String PASSWORD_RESET_SUCCESS = "Password has been reset successfully";
	String PASSWORD_RESET_FAILED = "Password reset failed due to entered incorrect old password. Please try again by entering correct password.";
	
	String SYSTEM_FAILURE = "Internal system error. Please contact administrator if the problem persists.";
	String CAMPAIGN_RUNNING = "#campaignname has been executed successfully";
	
	String ARCHIVED = "ARCHIVED";
	String CAMPAIGN_ARCHIVED = "#campaignname has been archived successfully";
	
	String SCHEDULER = "SCHEDULER";
	String ON_DEMAND = "ON DEMAND";
	
	String LOGGEDIN_USERNAME = "LOGGEDIN_USERNAME";
	String LOGGEDIN_USERID = "LOGGEDIN_USERID";
	String LOGGEDIN_USER_ROLE = "LOGGEDIN_USER_ROLE";
	String ADMIN = "ADMIN";
	
	String SESSION_EXPIRED = "Your session has expired. Please login again.";
	String USERINFO_NOT_EXIST = "User is not available in system. Please contact administrator.";
	String CAMPAIGN_MAPPING_SUCCESS = "Selected user campaign mapping have been successfully saved.";
	
	String FILE_NOT_FOUND = "File you are looking for might have been removed, had its name changed, or is temporarily unavailable.";
	String USERNAME_BLANK = "Username should not be blank.";
	String PASSWORD_BLANK = "Password should not be blank.";
	String INVALID_CREDENTIALS = "Invalid Credentials";
}
