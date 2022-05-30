# breakfast
自学写着玩的
	public static void main(String[] args) {
		File f=new File("D://product.txt");
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr=new FileReader(f);
			br=new BufferedReader(fr);
			String str=br.readLine();
			
			List<OrderMessage>list=new ArrayList<OrderMessage>();
			while(str!=null) {
				OrderMessage a=new OrderMessage();
				String[]strs=str.split(",");
				a.setId(Integer.parseInt(strs[0]));//编号
				a.setProductName(strs[1]);//产品名称
				a.setPrice(Integer.parseInt(strs[2]));//价格
				a.setNumber(Integer.parseInt(strs[3]));//数量
				list.add(a);
				str=br.readLine();	}
			for(OrderMessage in:list) {
				System.out.println(in.getId()+"---"+in.getProductName()+"---"+in.getPrice()+"---"+in.getNumber());}
				Collections.sort(list, new Comparator<OrderMessage>() {

					@Override
					public int compare(OrderMessage o1, OrderMessage o2) {
						// TODO Auto-generated method stub
						return o1.getNumber()>o2.getNumber()?1:-1;
					}
				});
				
			Scanner a=new Scanner(System.in);
			System.out.println("请输入你想要查询的产品名称");
			String myscanner=a.next();
			for(int t=0;t<=4;t++) {
			if(myscanner.equals(list.get(t).getProductName())) {
				System.out.println(list.get(t).getProductName()+list.get(t).getPrice());
			}
			
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		
				
		
	}

}
