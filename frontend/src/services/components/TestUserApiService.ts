import http from "../../http-common";

class TestUserApiService {
  getAll(): Promise<any> {
      return http.get("/test-users");
    }

  select(id: any): Promise<any> {
    return http.get(`/test-users/${id}`);
  }

  insert(data: any): Promise<any> {
    return http.post("/test-users", data);
  }

  update(id: any, data: any): Promise<any> {
    return http.put(`/test-users/${id}`, data);
  }

  delete(id: any): Promise<any> {
    return http.delete(`/test-users/${id}`);
  }

}

export default new TestUserApiService();
