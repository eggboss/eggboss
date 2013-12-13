package hornyu.cerberus.entities;

import java.util.ArrayList;
import java.util.List;

import hornyu.entities.AbstractEntity;

public class CerberusUserRole extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	private long userId;
	private long roleId;
	

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Override
	public List getKeyNames() {
		List<String> list = new ArrayList<String>();
		list.add("id");
		return list;
	}

	@Override
	public String getTableName() {
		return "cerberus_user_role";
	}

}
