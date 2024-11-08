package com.nntest.base;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SkipUrls {//Skip urls for novalnet.com
//    public Set<String> urlsToSkip = new HashSet<>(Arrays.asList(
//                "https://www.novalnet.com/wp-content/uploads/2024/03/kreditkarte-pcidss.webp",
//                "https://www.novalnet.com/wp-content/uploads/2024/03/Add-a-heading-1.svg",
//                "https://www.novalnet.com/wp-content/uploads/2024/03/software_hosted-1.webp",
//                "https://www.novalnet.com/wp-content/uploads/2022/08/alliance-for-cyber-security.svg",
//                "https://www.novalnet.com/wp-content/uploads/2024/06/cross-border-payments-150x150.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2024/06/influencer-marketing-150x150.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2024/06/ai-fraud-prevention-150x150.jpg",
//                "https://www.novalnet.com/wp-content/themes/wp-bootstrap-starter/images/linkedin.svg",
//                "https://www.novalnet.com/wp-content/themes/wp-bootstrap-starter/images/twitter_icon.png",
//                "https://www.novalnet.com/wp-content/themes/wp-bootstrap-starter/images/fb_icon.png",
//                "https://www.novalnet.com/wp-content/themes/wp-bootstrap-starter/images/instagram-icon.svg",
//                "https://www.novalnet.com/wp-content/themes/wp-bootstrap-starter/images/payment-plugin-form.webp",
//                "https://www.novalnet.com/wp-content/themes/wp-bootstrap-starter/images/form-bg.webp",
//                "https://www.novalnet.com/wp-content/themes/wp-bootstrap-starter/images/x_icon.png",
//                "https://secure.gravatar.com/avatar/f7c128604961b20d1bf893378c38799f?s=96&d=mm&r=g",
//                "https://secure.gravatar.com/avatar/18b486df93a8d05383af5a42c333dcd0?s=96&d=mm&r=g",
//            "https://secure.gravatar.com/avatar/f7c128604961b20d1bf893378c38799f?s=100&d=mm&r=g",
//            "https://secure.gravatar.com/avatar/7bcaf11a727676d811c8f3bc54392597?s=96&d=mm&r=g",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/novalnet-partnership.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2023/10/npay.png",
//                "https://www.novalnet.com/wp-content/uploads/2023/10/kakaopay.png",
//                "https://www.novalnet.com/wp-content/uploads/2023/08/payconiq-logo.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/visa-logo-1.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/mastercard-logo-1.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/maestro-logo-1.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/7-eleven-bill-pay.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/affinbank.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/10/AliPay-logo.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/amazon-pay-logo.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/ambank-logo.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/06/america-express-logo.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/apple-pay-logo.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/argencard-1.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/astropaycard.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/astropaydirect.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/aura.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/baloto.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/banamex.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/banco-de-chile.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/banco-do-brazil.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/Screenshot_2020-05-27-Free-Hybris-Payment-Module.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/BancoSantander.png",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/TEF.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/barzahlen-viacash.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/bbva-bancomer-logo.png",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/bitpay.png",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/Blik.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/boleto-bancario.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/bradesco.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/cabal-logo.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/carnet.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/Cartao-Mercado-Livre..png",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/Cartes-Bancaires.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/caratasi.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/carulla.png",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/cashon.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/cencosud.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/cimb-clicks.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/cmr.png",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/Logocoopeuch.png",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/corpbanca.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/dankort.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/davivienda.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/diners-international-logo.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/direct-carrier-billing.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2023/06/ach-1.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/06/direct-debit-bacs-logo.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/discover-network-logo.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/dragonpay.png",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/doku.jpeg",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/Echtzeit-Bankuberweisung.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/efecty.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/elo.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/emprese-de-energia.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/enets.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/eps-logo.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/myclearfpx.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/grabpay.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/giropay-logo.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/GPay_Acceptance_Mark_800.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/hipercard.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/ideal-logo.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/10/instalment-icon-1.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/in_payguara.jpeg",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/itau.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/iyzico.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/jcb-logo-1.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/klarna-logo.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2021/12/instalments.png",
//                "https://www.novalnet.com/wp-content/uploads/2021/12/paylater.png",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/Konbini.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/magna.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/maybank2u.png",
//                "https://www.novalnet.com/wp-content/uploads/2023/06/mbway_logo-2.png",
//                "https://www.novalnet.com/wp-content/uploads/2021/12/mobilepay.svg",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/mobile-payment.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/Multibanco.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/multicaja.png",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/mybank.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/naranja.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/nativa.png",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/neteller-vector-logo.png",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/onecard.png",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/SOFORT-PaymentBadge-Dark-Retina@2.png",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/ovo.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/oxxo.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/pago-efectivo.png",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/pago-facil.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/pse-pagos-seguros-en-linea.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/pay-direkt-logo.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/paypal-logo.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/paysafecard.png",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/paysafecashworld.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/paysbuy-logo.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/Paysera.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/payu-logo.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/poli-payments.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/postepay.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/postfinance-logo.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/Vorauskasse.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/presto.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/provincia.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/06/przelewy-logo.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/qiwi-wallet-logo.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/rapipago.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/redpagos.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/rhb-bank.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/safetypay.png",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/samsung-pay.png",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/santander.png",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/BancoSantander.png",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/satispay.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/sencillito.png",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/SEPA-Logo-DE.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/imgpsh_fullsize.jpeg",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/SEPA-online.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/Servipag.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/Singpost.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/skrill-logo.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/SPEI.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/surtimax.png",
//                "https://www.novalnet.com/wp-content/uploads/2021/12/swish.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/Tarjeta-logo.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/twint.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/trustly-logo.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/trustpay.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/Finnish.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2021/12/Vipps.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/unionpay-logo.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/webpay.png",
//                "https://www.novalnet.com/wp-content/uploads/2020/08/WeChat-pay-logo.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2020/05/yandex-money.jpg",
//                "https://www.novalnet.com/wp-content/uploads/2021/11/BigCommerce-logo-dark.png",
//                "https://www.novalnet.com/wp-content/uploads/2021/06/novalnet-partnership.jpg",
//            "https://www.novalnet.com/wp-content/uploads/2021/05/easy.png",
//            "https://www.novalnet.com/wp-content/uploads/2021/05/PCI.png",
//            "https://www.novalnet.com/wp-content/uploads/2021/05/3ds.png",
//            "https://www.novalnet.com/wp-content/uploads/2021/05/cart.png",
//            "https://www.novalnet.com/wp-content/uploads/2021/05/control-panel.png",
//            "https://www.novalnet.com/wp-content/uploads/2021/05/responsive.png",
//            "https://www.novalnet.com/wp-content/uploads/2023/06/Novalnet-Payment-Github-logo-300x300-1.png",
//            "https://www.novalnet.com/wp-content/uploads/2024/07/girocode.png",
//            "https://www.novalnet.com/wp-content/uploads/2023/11/Marketplace.png"
//
//        ));

    public Set<String> urlsToSkip = new HashSet<>(Arrays.asList(
            "https://www.novalnet.de/wp-content/uploads/2022/06/Novalnet-Logo.svg",
            "https://www.novalnet.de/wp-content/uploads/2022/12/right-arrow.png",
            "https://www.novalnet.de/wp-content/uploads/2022/10/back.png",
            "https://www.novalnet.de/wp-content/uploads/2022/10/next.png",
            "https://www.novalnet.de/wp-content/uploads/2022/02/kreditkarte-pcidss.png",
            "https://www.novalnet.de/wp-content/uploads/2024/03/tuv-1.png",
            "https://www.novalnet.de/wp-content/uploads/2022/02/software_hosted-1.png",
            "https://www.novalnet.de/wp-content/uploads/2024/03/alliance-for-cyber-security-1.svg",
            "https://www.novalnet.de/wp-content/uploads/2024/03/tuv-de-150x150.jpg",
            "https://www.novalnet.de/wp-content/uploads/2024/02/united-nations-global-compact-novalnet-150x150.jpg",
            "https://www.novalnet.de/wp-content/uploads/2024/02/Novalnet-ISO20022-150x150.jpg",
            "https://www.novalnet.de/wp-content/themes/novalnet/assets/img/linkedin.svg",
            "https://www.novalnet.de/wp-content/themes/novalnet/assets/img/twitter_icon.webp",
            "https://www.novalnet.de/wp-content/themes/novalnet/assets/img/fb_icon.webp",
            "https://www.novalnet.de/wp-content/themes/novalnet/assets/img/instagram-icon.svg",
            "https://www.novalnet.de/wp-content/themes/novalnet/assets/img/x_icon.webp",
            "https://www.novalnet.de/wp-content/themes/novalnet/assets/img/top.svg",
            "https://www.novalnet.de/wp-content/uploads/2022/06/Novalnet-Logo.svg",
            "https://www.novalnet.de/wp-content/uploads/2022/06/Novalnet-Logo.svg",
            "https://www.novalnet.de/wp-content/uploads/2021/06/integration-banner.jpg",
            "https://www.novalnet.de/wp-content/uploads/2021/08/easy.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/PCI.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/3ds.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/cart.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/control-panel.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/responsive.png",
            "https://www.novalnet.de/wp-content/uploads/2020/10/Novalnet-Payment-Github-logo-300x300.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/7-eleven-bill-pay.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/affinbank.png",
            "https://www.novalnet.de/wp-content/uploads/2021/06/alipay-1.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/amazon-pay.png",
            "https://www.novalnet.de/wp-content/uploads/2021/06/ambank-logo-2.png",
            "https://www.novalnet.de/wp-content/uploads/2012/08/americanexpress-logo.jpg",
            "https://www.novalnet.de/wp-content/uploads/2021/06/apple-pay-logo-min.jpg",
            "https://www.novalnet.de/wp-content/uploads/2018/10/argencard.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/astropaycard.png",
            "https://www.novalnet.de/wp-content/uploads/2021/06/astropaydirect.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/aura.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/baloto.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/banamex.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/banco-de-chile.jpg",
            "https://www.novalnet.de/wp-content/uploads/2018/10/banco-de-occidente.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/banco-do-brazil.png",
            "https://www.novalnet.de/wp-content/uploads/2020/06/bancontact.jpg",
            "https://www.novalnet.de/wp-content/uploads/2021/08/BancoSantander.png",
            "https://www.novalnet.de/wp-content/uploads/2018/08/endcustomer.png",
            "https://www.novalnet.de/wp-content/uploads/2020/12/viacash_Barzahlen.png",
            "https://www.novalnet.de/wp-content/uploads/2016/10/barzahlung-bei-abholung.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/bbva-bancomer-logo.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/bitpay.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/Blik.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/boleto-bancario.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/bradesco.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/cabal-logo-1.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/carnet.jpg",
            "https://www.novalnet.de/wp-content/uploads/2018/10/cartao-mercado-livre.png",
            "https://www.novalnet.de/wp-content/uploads/2020/06/Cartes-Bancaires.jpg",
            "https://www.novalnet.de/wp-content/uploads/2016/12/caratasi.jpg",
            "https://www.novalnet.de/wp-content/uploads/2018/10/carulla.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/cencosud.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/cimb-clicks.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/cmr.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/coopeuch.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/corpbanca.png",
            "https://www.novalnet.de/wp-content/uploads/2017/06/dankort.jpg",
            "https://www.novalnet.de/wp-content/uploads/2018/10/davivienda.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/dinersclub.png",
            "https://www.novalnet.de/wp-content/uploads/2017/06/direct-carrier-billing.jpg",
            "https://www.novalnet.de/wp-content/uploads/2023/06/ach-1.png",
            "https://www.novalnet.de/wp-content/uploads/2019/04/direct-debit.png",
            "https://www.novalnet.de/wp-content/uploads/2018/05/discover.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/dragonpay.png",
            "https://www.novalnet.de/wp-content/uploads/2018/08/endcustomer.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/efecty.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/elo.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/emprese-de-energia.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/enets.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/eps-logo.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/myclearfpx.jpg",
            "https://www.novalnet.de/wp-content/uploads/2021/08/grabpay.png",
            "https://www.novalnet.de/wp-content/uploads/2024/07/girocode.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/giropay.png",
            "https://www.novalnet.de/wp-content/uploads/2020/06/Google-Pay.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/hipercard.png",
            "https://www.novalnet.de/wp-content/uploads/2018/05/ideal-logo.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/itau.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/iyzico.png",
            "https://www.novalnet.de/wp-content/uploads/2018/04/jcb.png",
            "https://www.novalnet.de/wp-content/uploads/2023/10/kakaopay.png",
            "https://www.novalnet.de/wp-content/uploads/2021/06/klarna-logo-min.jpg",
            "https://www.novalnet.de/wp-content/uploads/2021/08/instalments.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/paylater.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/Konbini.jpg",
            "https://www.novalnet.de/wp-content/uploads/2021/08/maestro-logo.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/magna.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/mastercard-logo.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/maybank2u.png",
            "https://www.novalnet.de/wp-content/uploads/2021/12/mobilepay.svg",
            "https://www.novalnet.de/wp-content/uploads/2018/10/mobile-payment.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/multibanco.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/myclearfpx.jpg",
            "https://www.novalnet.de/wp-content/uploads/2021/08/mybank.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/naranja.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/nativa.png",
            "https://www.novalnet.de/wp-content/uploads/2023/10/npay.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/neteller-vector-logo.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/onecard.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/ovo.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/oxxo.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/pago-efectivo.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/pago-facil.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/pse-pagos-seguros-en-linea.jpg",
            "https://www.novalnet.de/wp-content/uploads/2023/08/payconiq.jpg",
            "https://www.novalnet.de/wp-content/uploads/2018/10/paydirekt.png",
            "https://www.novalnet.de/wp-content/uploads/2021/06/paypal-logo-min.jpg",
            "https://www.novalnet.de/wp-content/uploads/2021/08/paysafecard.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/paysafecash-world.jpg",
            "https://www.novalnet.de/wp-content/uploads/2018/10/paysbuy-wallet.jpeg",
            "https://www.novalnet.de/wp-content/uploads/2021/08/Paysera.jpg",
            "https://www.novalnet.de/wp-content/uploads/2018/10/payu-logo.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/poli.png",
            "https://www.novalnet.de/wp-content/uploads/2018/05/postepay.png",
            "https://www.novalnet.de/wp-content/uploads/2018/05/postfinance-logo.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/presto.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/provincia.jpg",
            "https://www.novalnet.de/wp-content/uploads/2017/06/przelewy24-logo.jpg",
            "https://www.novalnet.de/wp-content/uploads/2018/10/qiwi.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/rapipago.png",
            "https://www.novalnet.de/wp-content/uploads/2022/03/instalment-icon-1-min.png",
            "https://www.novalnet.de/wp-content/uploads/2022/03/novalnet-invoice-min.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/imgpsh_fullsize.jpeg",
            "https://www.novalnet.de/wp-content/uploads/2018/10/redpagos.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/rhb-bank.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/safetypay.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/samsung-pay.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/santander.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/Santander.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/satispay.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/sencillito.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/imgpsh_fullsize.jpeg",
            "https://www.novalnet.de/wp-content/uploads/2018/05/sepa.jpg",
            "https://www.novalnet.de/wp-content/uploads/2018/10/servipag.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/singpost-logo.png",
            "https://www.novalnet.de/wp-content/uploads/2021/06/skrill-logo-min.jpg",
            "https://www.novalnet.de/wp-content/uploads/2022/06/sofort-logo.svg",
            "https://www.novalnet.de/wp-content/uploads/2018/10/spei.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/surtimax.png",
            "https://www.novalnet.de/wp-content/uploads/2021/12/swish.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/tarjeta-shopping.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/twint.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/trustly.jpg",
            "https://www.novalnet.de/wp-content/uploads/2017/06/Trustpay-logo.jpg",
            "https://www.novalnet.de/wp-content/uploads/2021/06/UnionPay-Logo.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/Finnish.jpg",
            "https://www.novalnet.de/wp-content/uploads/2021/12/Vipps.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/visa-logo_0.png",
            "https://www.novalnet.de/wp-content/uploads/2016/09/Vorauskasse.jpg",
            "https://www.novalnet.de/wp-content/uploads/2018/10/webpay.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/wechatpay.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/yandex-money.jpg",
            "https://www.novalnet.de/wp-content/uploads/2021/08/SEPA-Logo-DE.png",
            "https://www.novalnet.de/wp-content/uploads/2018/10/multicaja.png",
            "https://www.novalnet.de/wp-content/uploads/2021/08/doku.jpeg",
            "https://www.novalnet.de/wp-content/uploads/2021/07/user.png"

    ));

}
