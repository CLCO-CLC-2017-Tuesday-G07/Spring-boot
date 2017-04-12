package hello;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class SlideServiceImpl implements SlideService {

	@Autowired
	SlideBarDAO slideDao;
	@Override
	public SlideBar findById(int id) {
		// TODO Auto-generated method stub
		return slideDao.findByid(id);
	}

	@Override
	public void saveWebpage(SlideBar webInfo) {
		// TODO Auto-generated method stub
		slideDao.save(webInfo);
	}

	@Override
	public void updateWebpage(SlideBar webInfo) {
		System.out.println(webInfo.getPage_id());
		String s=webInfo.getPage_id().toString();
		int id=Integer.parseInt(s);
		SlideBar entity=slideDao.findByid(id);
		if(entity!=null){
			entity.setUrlHinh(webInfo.getUrlHinh());
			
		}
	}

	@Override
	public void deleteUserById(int id) {
		// TODO Auto-generated method stub
		slideDao.deleteById(id);
	}

	@Override
	public List<SlideBar> findAllWebPages() {
		// TODO Auto-generated method stub
		return slideDao.findAllWebpages();
	}

}
