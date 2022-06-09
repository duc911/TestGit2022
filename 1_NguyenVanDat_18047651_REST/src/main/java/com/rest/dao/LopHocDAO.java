package com.rest.dao;

import java.util.List;
 /// nho  chon thu vien until List :)) khong thi 4 tr di 
import com.rest.entity.LopHoc;

public interface LopHocDAO {
  public List<LopHoc> getAll();
  
  public void add(LopHoc lopHoc);
  
  public void update(LopHoc lopHoc);
  
  public void delete(int id);
  
  public LopHoc getbyId(int id);
  
}
