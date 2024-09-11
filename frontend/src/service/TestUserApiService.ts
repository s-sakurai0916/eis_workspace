import http from "@/http-common";

class TestUserApiService {
  getAll(): Promise<any> {
      return http.get("/test-user");
    }

  select(id: any): Promise<any> {
    return http.get(`/test-user/${id}`);
  }

  create(data: any): Promise<any> {
    return http.post("/test-user", data);
  }

  update(id: any, data: any): Promise<any> {
    return http.put(`/test-user/${id}`, data);
  }

  delete(id: any): Promise<any> {
    return http.delete(`/test-user/${id}`);
  }

}

export default new TestUserApiService();
