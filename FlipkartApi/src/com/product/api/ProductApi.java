package com.product.api;

public class ProductApi {

	public void productApi(String _key) {
		if (Product.LAPTOP.equals(_key)) {
			System.out.println("================================================================================\n"
					+ "                            LAPTOP PRODUCT API RESPONSE\n"
					+ "================================================================================\n" + "{\n"
					+ "  \"status\": \"success\",\n" + "  \"timestamp\": \"2026-07-03T12:30:45.678\",\n"
					+ "  \"data\": {\n" + "    \"product\": {\n" + "      \"id\": \"LAPTOP-2025-X1\",\n"
					+ "      \"name\": \"Dell XPS 15 9530\",\n" + "      \"category\": \"Laptop\",\n"
					+ "      \"brand\": \"Dell\",\n" + "      \"price\": 1899.99,\n" + "      \"currency\": \"USD\",\n"
					+ "      \"specifications\": {\n" + "        \"processor\": \"Intel Core i7-13700H\",\n"
					+ "        \"ram\": \"32GB LPDDR5\",\n" + "        \"storage\": \"1TB NVMe SSD\",\n"
					+ "        \"display\": \"15.6-inch 4K OLED Touch\",\n"
					+ "        \"graphics\": \"NVIDIA RTX 4070\"\n" + "      },\n" + "      \"inStock\": true,\n"
					+ "      \"rating\": 4.8,\n" + "      \"reviewCount\": 1247\n" + "    }\n" + "  },\n"
					+ "  \"message\": \"Product details retrieved successfully\"\n" + "}\n"
					+ "================================================================================");
		} else if (Product.WASHINGMACHINE.equals(_key)) {
			System.out.println("================================================================================\n"
					+ "                        WASHING MACHINE PRODUCT API RESPONSE\n"
					+ "================================================================================\n" + "{\n"
					+ "  \"status\": \"success\",\n" + "  \"timestamp\": \"2026-07-03T12:45:30.678\",\n"
					+ "  \"data\": {\n" + "    \"product\": {\n" + "      \"id\": \"WM-2025-LG01\",\n"
					+ "      \"name\": \"LG Front Load Washing Machine 8kg\",\n"
					+ "      \"category\": \"Washing Machine\",\n" + "      \"brand\": \"LG\",\n"
					+ "      \"price\": 649.99,\n" + "      \"currency\": \"USD\",\n" + "      \"specifications\": {\n"
					+ "        \"capacity\": \"8kg\",\n" + "        \"type\": \"Front Load\",\n"
					+ "        \"spinSpeed\": \"1400 RPM\",\n" + "        \"energyRating\": \"5 Star\",\n"
					+ "        \"washPrograms\": \"14 Programs\"\n" + "      },\n" + "      \"inStock\": true,\n"
					+ "      \"rating\": 4.6,\n" + "      \"reviewCount\": 892\n" + "    }\n" + "  },\n"
					+ "  \"message\": \"Product details retrieved successfully\"\n" + "}\n"
					+ "================================================================================");
		}

		else if (Product.SMARTPHONE.equals(_key)) {
			System.out.println("================================================================================\n"
					+ "                          SMARTPHONE PRODUCT API RESPONSE\n"
					+ "================================================================================\n" + "{\n"
					+ "  \"status\": \"success\",\n" + "  \"timestamp\": \"2026-07-03T13:00:15.678\",\n"
					+ "  \"data\": {\n" + "    \"product\": {\n" + "      \"id\": \"PHONE-2025-S24\",\n"
					+ "      \"name\": \"Samsung Galaxy S24 Ultra\",\n" + "      \"category\": \"Smartphone\",\n"
					+ "      \"brand\": \"Samsung\",\n" + "      \"price\": 1299.99,\n"
					+ "      \"currency\": \"USD\",\n" + "      \"specifications\": {\n"
					+ "        \"processor\": \"Snapdragon 8 Gen 3\",\n" + "        \"ram\": \"12GB\",\n"
					+ "        \"storage\": \"512GB\",\n" + "        \"display\": \"6.8-inch Dynamic AMOLED 2X\",\n"
					+ "        \"camera\": \"200MP + 50MP + 12MP + 10MP\",\n" + "        \"battery\": \"5000mAh\"\n"
					+ "      },\n" + "      \"inStock\": true,\n" + "      \"rating\": 4.9,\n"
					+ "      \"reviewCount\": 2154\n" + "    }\n" + "  },\n"
					+ "  \"message\": \"Product details retrieved successfully\"\n" + "}\n"
					+ "================================================================================");
		}

		else {
			System.out.println("API not Available");
		}

	}
}
