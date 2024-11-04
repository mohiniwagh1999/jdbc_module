package in.ashok.service;

import in.ashok.test.Dao;

public class BookserviceImpl implements Bookservice {
    private Dao dao;
    public void  setdao( Dao dao)
    {
    	this.dao=dao;
    }
	@Override
	public void saveBook() {
		// TODO Auto-generated method stub
		boolean status=dao.save();
		if(status==true)
		{
			System.out.println("data inserted");
		}
		
		else
		{
			System.out.println("failed to inserted");
		}
		
	}

}
