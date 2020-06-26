package service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import dao.BaseDao;

public class DeleteImage implements Tools {

	@Override
	public JSONArray work(JSONArray jsonArr) {
		JSONObject json = jsonArr.getJSONObject(1);
		String uid = json.getString("uid");
		int gid = json.getIntValue("gid");
		long timestamp = json.getLongValue("timestamp");
		int status = BaseDao.deleteImage(uid, gid, timestamp);
		jsonArr.clear();
		JSONObject result = new JSONObject();
		result.put("status", status);
		jsonArr.add(result);
		return jsonArr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
