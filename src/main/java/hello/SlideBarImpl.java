package hello;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import java.util.List;



@Repository("SlideBarDAO")
public class SlideBarImpl extends AbstractSlideBarDAO<Integer, SlideBar> implements SlideBarDAO{

	@Override
	public SlideBar findByid(int id) {
		// TODO Auto-generated method stub
		SlideBar slideBar = getByKey(id);
		return slideBar;
	}

	@Override
	public List<SlideBar> findAllWebpages() {
		// TODO Auto-generated method stub
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("page_id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<SlideBar> slideBarList = (List<SlideBar>) criteria.list();
		return slideBarList;
	}
	@Override
	public void save(SlideBar webInfo) {
		// TODO Auto-generated method stub
		persist(webInfo);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("page_id", id));
		SlideBar webInfo = (SlideBar)crit.uniqueResult();
		delete(webInfo);
	}

	


	
}