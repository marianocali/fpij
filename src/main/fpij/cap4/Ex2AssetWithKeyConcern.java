package main.fpij.cap4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex2AssetWithKeyConcern {

    public static int totalAssetValues(final List<Asset> assets, final Predicate<Asset> assetSelector){
        return assets.stream()
                .filter(assetSelector)
                .mapToInt(Asset::getValue)
                .sum();
    }

    public static void main(String[] args){
        final List<Asset> assets = Arrays.asList(
                new Asset(Asset.AssetType.BOND, 1000),
                new Asset(Asset.AssetType.BOND, 2000),
                new Asset(Asset.AssetType.STOCK, 3000),
                new Asset(Asset.AssetType.STOCK, 4000)
        );
        Predicate<Asset> bondPredicate = asset-> asset.getType() == Asset.AssetType.BOND;
        Predicate<Asset> stockPredicate = asset-> asset.getType() == Asset.AssetType.STOCK;
        System.out.println("Total of all bond assets: " + totalAssetValues(assets, bondPredicate));
        System.out.println("Total of all stock assets: " + totalAssetValues(assets, stockPredicate));
        System.out.println("Total of all assets: " + totalAssetValues(assets, asset -> true));
    }

}
