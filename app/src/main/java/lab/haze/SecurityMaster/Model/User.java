package lab.haze.SecurityMaster.Model;

import javax.swing.border.StrokeBorder;

import lombok.Data;
import java.util.Date;

@Data
public class User {
    private String id;
    private String name;
    private String password;
    private String role;
    private String created_user;
	private Date created_at;
	private String updated_user;
	private Date updated_at;
	private String deleted_user;
	private Date deleted_at;
	private int version;
}
