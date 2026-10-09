
import pandas as pd

def find_products(products: pd.DataFrame) -> pd.DataFrame:
    find_product = (products['low_fats'] == 'Y') & (products['recyclable'] == 'Y')
    return products.loc[find_product, ['product_id']]