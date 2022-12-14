package team.bakkas.domain.shopItem.vo

import javax.persistence.Embeddable

@Embeddable
data class PriceInfo(
    var originalPrice: Int = 0,
    var salePrice: Int = 0
) {

}
