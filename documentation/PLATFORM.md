# FDK Platform Front API Documentaion


* [Lead](#Lead) - Handles communication between Administrator <-> Staff and Staff <-> Users 
* [Feedback](#Feedback) - User Reviews and Rating System 
* [Theme](#Theme) - Responsible for themes 
* [User](#User) - Authentication Service 
* [Content](#Content) - Content System 
* [Assignment](#Assignment) -  
* [Billing](#Billing) - Handle platform subscription 
* [Communication](#Communication) - Manages email, sms, push notifications sent to users 
* [Payment](#Payment) - Collect payment through many payment gateway i.e Stripe, Razorpay, Juspay etc.into Fynd or Self account 
* [Order](#Order) - Handles Platform websites OMS 
* [Catalog](#Catalog) - Catalog API's allows you to access list of products, prices, seller details, similar features, variants and many more useful features.  
* [CompanyProfile](#CompanyProfile) - Company Profile API's allows you to access list of products, prices, seller details, similar features, variants and many more useful features.  
* [FileStorage](#FileStorage) - File Storage 
* [Share](#Share) - Short link and QR Code 
* [Inventory](#Inventory) -  
* [Configuration](#Configuration) - Application configuration apis 
* [Cart](#Cart) - Cart APIs 
* [Rewards](#Rewards) - Rewards 
* [Analytics](#Analytics) - Perceptor analytics 
* [Discount](#Discount) - Discount 
* [Partner](#Partner) - Partner configuration apis 
* [Webhook](#Webhook) - Webhook dispatcher with retry and one event to many subscriber vice versa 

----
----

### Classes and Methods


* [Lead](#Lead)
  * [Lead#getTickets](#leadgettickets)
  * [Lead#createTicket](#leadcreateticket)
  * [Lead#getTickets](#leadgettickets)
  * [Lead#getTicket](#leadgetticket)
  * [Lead#editTicket](#leadeditticket)
  * [Lead#getTicket](#leadgetticket)
  * [Lead#editTicket](#leadeditticket)
  * [Lead#createHistory](#leadcreatehistory)
  * [Lead#getTicketHistory](#leadgettickethistory)
  * [Lead#createHistory](#leadcreatehistory)
  * [Lead#getTicketHistory](#leadgettickethistory)
  * [Lead#getCustomForm](#leadgetcustomform)
  * [Lead#editCustomForm](#leadeditcustomform)
  * [Lead#getCustomForms](#leadgetcustomforms)
  * [Lead#createCustomForm](#leadcreatecustomform)
  * [Lead#getTokenForVideoRoom](#leadgettokenforvideoroom)
  * [Lead#getTokenForVideoRoom](#leadgettokenforvideoroom)
  * [Lead#getVideoParticipants](#leadgetvideoparticipants)
  * [Lead#getVideoParticipants](#leadgetvideoparticipants)
  * [Lead#openVideoRoom](#leadopenvideoroom)
  * [Lead#closeVideoRoom](#leadclosevideoroom)
 
* [Feedback](#Feedback)
  * [Feedback#getAttributes](#feedbackgetattributes)
  * [Feedback#getCustomerReviews](#feedbackgetcustomerreviews)
  * [Feedback#updateApprove](#feedbackupdateapprove)
  * [Feedback#getHistory](#feedbackgethistory)
  * [Feedback#getApplicationTemplates](#feedbackgetapplicationtemplates)
  * [Feedback#createTemplate](#feedbackcreatetemplate)
  * [Feedback#getTemplateById](#feedbackgettemplatebyid)
  * [Feedback#updateTemplate](#feedbackupdatetemplate)
  * [Feedback#updateTemplateStatus](#feedbackupdatetemplatestatus)
 
* [Theme](#Theme)
  * [Theme#getAllPages](#themegetallpages)
  * [Theme#createPage](#themecreatepage)
  * [Theme#updateMultiplePages](#themeupdatemultiplepages)
  * [Theme#getPage](#themegetpage)
  * [Theme#updatePage](#themeupdatepage)
  * [Theme#deletePage](#themedeletepage)
  * [Theme#getThemeLibrary](#themegetthemelibrary)
  * [Theme#addToThemeLibrary](#themeaddtothemelibrary)
  * [Theme#applyTheme](#themeapplytheme)
  * [Theme#isUpgradable](#themeisupgradable)
  * [Theme#upgradeTheme](#themeupgradetheme)
  * [Theme#getPublicThemes](#themegetpublicthemes)
  * [Theme#createTheme](#themecreatetheme)
  * [Theme#getAppliedTheme](#themegetappliedtheme)
  * [Theme#getFonts](#themegetfonts)
  * [Theme#getThemeById](#themegetthemebyid)
  * [Theme#updateTheme](#themeupdatetheme)
  * [Theme#deleteTheme](#themedeletetheme)
  * [Theme#getThemeForPreview](#themegetthemeforpreview)
  * [Theme#publishTheme](#themepublishtheme)
  * [Theme#unpublishTheme](#themeunpublishtheme)
  * [Theme#archiveTheme](#themearchivetheme)
  * [Theme#unarchiveTheme](#themeunarchivetheme)
 
* [User](#User)
  * [User#getCustomers](#usergetcustomers)
  * [User#searchUsers](#usersearchusers)
  * [User#getPlatformConfig](#usergetplatformconfig)
  * [User#updatePlatformConfig](#userupdateplatformconfig)
 
* [Content](#Content)
  * [Content#getAnnouncementsList](#contentgetannouncementslist)
  * [Content#createAnnouncement](#contentcreateannouncement)
  * [Content#getAnnouncementById](#contentgetannouncementbyid)
  * [Content#updateAnnouncement](#contentupdateannouncement)
  * [Content#updateAnnouncementSchedule](#contentupdateannouncementschedule)
  * [Content#deleteAnnouncement](#contentdeleteannouncement)
  * [Content#createBlog](#contentcreateblog)
  * [Content#getBlogs](#contentgetblogs)
  * [Content#updateBlog](#contentupdateblog)
  * [Content#deleteBlog](#contentdeleteblog)
  * [Content#getComponentById](#contentgetcomponentbyid)
  * [Content#getFaqCategories](#contentgetfaqcategories)
  * [Content#getFaqCategoryBySlugOrId](#contentgetfaqcategorybyslugorid)
  * [Content#createFaqCategory](#contentcreatefaqcategory)
  * [Content#updateFaqCategory](#contentupdatefaqcategory)
  * [Content#deleteFaqCategory](#contentdeletefaqcategory)
  * [Content#getFaqsByCategoryIdOrSlug](#contentgetfaqsbycategoryidorslug)
  * [Content#addFaq](#contentaddfaq)
  * [Content#updateFaq](#contentupdatefaq)
  * [Content#deleteFaq](#contentdeletefaq)
  * [Content#getFaqByIdOrSlug](#contentgetfaqbyidorslug)
  * [Content#getLandingPages](#contentgetlandingpages)
  * [Content#createLandingPage](#contentcreatelandingpage)
  * [Content#updateLandingPage](#contentupdatelandingpage)
  * [Content#deleteLandingPage](#contentdeletelandingpage)
  * [Content#getLegalInformation](#contentgetlegalinformation)
  * [Content#updateLegalInformation](#contentupdatelegalinformation)
  * [Content#getNavigations](#contentgetnavigations)
  * [Content#createNavigation](#contentcreatenavigation)
  * [Content#getDefaultNavigations](#contentgetdefaultnavigations)
  * [Content#getNavigationBySlug](#contentgetnavigationbyslug)
  * [Content#updateNavigation](#contentupdatenavigation)
  * [Content#deleteNavigation](#contentdeletenavigation)
  * [Content#getPageMeta](#contentgetpagemeta)
  * [Content#getPageSpec](#contentgetpagespec)
  * [Content#createPage](#contentcreatepage)
  * [Content#getPages](#contentgetpages)
  * [Content#createPagePreview](#contentcreatepagepreview)
  * [Content#updatePagePreview](#contentupdatepagepreview)
  * [Content#updatePage](#contentupdatepage)
  * [Content#deletePage](#contentdeletepage)
  * [Content#getPageBySlug](#contentgetpagebyslug)
  * [Content#getSEOConfiguration](#contentgetseoconfiguration)
  * [Content#updateSEOConfiguration](#contentupdateseoconfiguration)
  * [Content#getSlideshows](#contentgetslideshows)
  * [Content#createSlideshow](#contentcreateslideshow)
  * [Content#getSlideshowBySlug](#contentgetslideshowbyslug)
  * [Content#updateSlideshow](#contentupdateslideshow)
  * [Content#deleteSlideshow](#contentdeleteslideshow)
  * [Content#getSupportInformation](#contentgetsupportinformation)
  * [Content#updateSupportInformation](#contentupdatesupportinformation)
  * [Content#updateInjectableTag](#contentupdateinjectabletag)
  * [Content#deleteAllInjectableTags](#contentdeleteallinjectabletags)
  * [Content#getInjectableTags](#contentgetinjectabletags)
  * [Content#addInjectableTag](#contentaddinjectabletag)
  * [Content#removeInjectableTag](#contentremoveinjectabletag)
  * [Content#editInjectableTag](#contenteditinjectabletag)
 
* [Assignment](#Assignment)
  * [Assignment#createPickupLocation](#assignmentcreatepickuplocation)
  * [Assignment#getPickupLocation](#assignmentgetpickuplocation)
  * [Assignment#updatePickupLocation](#assignmentupdatepickuplocation)
  * [Assignment#getPickupLocationById](#assignmentgetpickuplocationbyid)
  * [Assignment#createPickupConfiguration](#assignmentcreatepickupconfiguration)
  * [Assignment#getPickupConfiguration](#assignmentgetpickupconfiguration)
  * [Assignment#getAllocationConfiguration](#assignmentgetallocationconfiguration)
  * [Assignment#createAllocationConfiguration](#assignmentcreateallocationconfiguration)
  * [Assignment#updateAllocationConfiguration](#assignmentupdateallocationconfiguration)
  * [Assignment#getAllocationLocations](#assignmentgetallocationlocations)
  * [Assignment#getAllocationLocationById](#assignmentgetallocationlocationbyid)
  * [Assignment#updateAllocationLocation](#assignmentupdateallocationlocation)
  * [Assignment#createAllocationLocation](#assignmentcreateallocationlocation)
  * [Assignment#getDestinationZones](#assignmentgetdestinationzones)
  * [Assignment#postDestinationZone](#assignmentpostdestinationzone)
  * [Assignment#getDestinationZoneById](#assignmentgetdestinationzonebyid)
  * [Assignment#updateDestinationZone](#assignmentupdatedestinationzone)
 
* [Billing](#Billing)
  * [Billing#createSubscriptionCharge](#billingcreatesubscriptioncharge)
  * [Billing#getSubscriptionCharge](#billinggetsubscriptioncharge)
  * [Billing#cancelSubscriptionCharge](#billingcancelsubscriptioncharge)
  * [Billing#getInvoices](#billinggetinvoices)
  * [Billing#getInvoiceById](#billinggetinvoicebyid)
  * [Billing#getCustomerDetail](#billinggetcustomerdetail)
  * [Billing#upsertCustomerDetail](#billingupsertcustomerdetail)
  * [Billing#getSubscription](#billinggetsubscription)
  * [Billing#getFeatureLimitConfig](#billinggetfeaturelimitconfig)
  * [Billing#activateSubscriptionPlan](#billingactivatesubscriptionplan)
  * [Billing#cancelSubscriptionPlan](#billingcancelsubscriptionplan)
 
* [Communication](#Communication)
  * [Communication#getCampaigns](#communicationgetcampaigns)
  * [Communication#createCampaign](#communicationcreatecampaign)
  * [Communication#getCampaignById](#communicationgetcampaignbyid)
  * [Communication#updateCampaignById](#communicationupdatecampaignbyid)
  * [Communication#getStatsOfCampaignById](#communicationgetstatsofcampaignbyid)
  * [Communication#getAudiences](#communicationgetaudiences)
  * [Communication#createAudience](#communicationcreateaudience)
  * [Communication#getBigqueryHeaders](#communicationgetbigqueryheaders)
  * [Communication#getAudienceById](#communicationgetaudiencebyid)
  * [Communication#updateAudienceById](#communicationupdateaudiencebyid)
  * [Communication#getNSampleRecordsFromCsv](#communicationgetnsamplerecordsfromcsv)
  * [Communication#getEmailProviders](#communicationgetemailproviders)
  * [Communication#createEmailProvider](#communicationcreateemailprovider)
  * [Communication#getEmailProviderById](#communicationgetemailproviderbyid)
  * [Communication#updateEmailProviderById](#communicationupdateemailproviderbyid)
  * [Communication#getEmailTemplates](#communicationgetemailtemplates)
  * [Communication#createEmailTemplate](#communicationcreateemailtemplate)
  * [Communication#getSystemEmailTemplates](#communicationgetsystememailtemplates)
  * [Communication#getEmailTemplateById](#communicationgetemailtemplatebyid)
  * [Communication#updateEmailTemplateById](#communicationupdateemailtemplatebyid)
  * [Communication#deleteEmailTemplateById](#communicationdeleteemailtemplatebyid)
  * [Communication#getEventSubscriptions](#communicationgeteventsubscriptions)
  * [Communication#getJobs](#communicationgetjobs)
  * [Communication#triggerCampaignJob](#communicationtriggercampaignjob)
  * [Communication#getJobLogs](#communicationgetjoblogs)
  * [Communication#getCommunicationLogs](#communicationgetcommunicationlogs)
  * [Communication#getSystemNotifications](#communicationgetsystemnotifications)
  * [Communication#getSmsProviders](#communicationgetsmsproviders)
  * [Communication#createSmsProvider](#communicationcreatesmsprovider)
  * [Communication#getSmsProviderById](#communicationgetsmsproviderbyid)
  * [Communication#updateSmsProviderById](#communicationupdatesmsproviderbyid)
  * [Communication#getSmsTemplates](#communicationgetsmstemplates)
  * [Communication#createSmsTemplate](#communicationcreatesmstemplate)
  * [Communication#getSmsTemplateById](#communicationgetsmstemplatebyid)
  * [Communication#updateSmsTemplateById](#communicationupdatesmstemplatebyid)
  * [Communication#deleteSmsTemplateById](#communicationdeletesmstemplatebyid)
  * [Communication#getSystemSystemTemplates](#communicationgetsystemsystemtemplates)
 
* [Payment](#Payment)
  * [Payment#getBrandPaymentGatewayConfig](#paymentgetbrandpaymentgatewayconfig)
  * [Payment#saveBrandPaymentGatewayConfig](#paymentsavebrandpaymentgatewayconfig)
  * [Payment#updateBrandPaymentGatewayConfig](#paymentupdatebrandpaymentgatewayconfig)
  * [Payment#getPaymentModeRoutes](#paymentgetpaymentmoderoutes)
  * [Payment#getAllPayouts](#paymentgetallpayouts)
  * [Payment#savePayout](#paymentsavepayout)
  * [Payment#updatePayout](#paymentupdatepayout)
  * [Payment#activateAndDectivatePayout](#paymentactivateanddectivatepayout)
  * [Payment#deletePayout](#paymentdeletepayout)
  * [Payment#getSubscriptionPaymentMethod](#paymentgetsubscriptionpaymentmethod)
  * [Payment#deleteSubscriptionPaymentMethod](#paymentdeletesubscriptionpaymentmethod)
  * [Payment#getSubscriptionConfig](#paymentgetsubscriptionconfig)
  * [Payment#saveSubscriptionSetupIntent](#paymentsavesubscriptionsetupintent)
  * [Payment#addBeneficiaryDetails](#paymentaddbeneficiarydetails)
  * [Payment#verifyIfscCode](#paymentverifyifsccode)
  * [Payment#getUserOrderBeneficiaries](#paymentgetuserorderbeneficiaries)
  * [Payment#getUserBeneficiaries](#paymentgetuserbeneficiaries)
 
* [Order](#Order)
  * [Order#shipmentStatusUpdate](#ordershipmentstatusupdate)
  * [Order#activityStatus](#orderactivitystatus)
  * [Order#storeProcessShipmentUpdate](#orderstoreprocessshipmentupdate)
  * [Order#checkRefund](#ordercheckrefund)
  * [Order#getOrdersByCompanyId](#ordergetordersbycompanyid)
  * [Order#getOrderDetails](#ordergetorderdetails)
  * [Order#getPicklistOrdersByCompanyId](#ordergetpicklistordersbycompanyid)
  * [Order#trackShipmentPlatform](#ordertrackshipmentplatform)
  * [Order#trackOrder](#ordertrackorder)
  * [Order#failedOrders](#orderfailedorders)
  * [Order#reprocessOrder](#orderreprocessorder)
  * [Order#updateShipment](#orderupdateshipment)
  * [Order#getPlatformShipmentReasons](#ordergetplatformshipmentreasons)
  * [Order#getShipmentTrackDetails](#ordergetshipmenttrackdetails)
  * [Order#getShipmentAddress](#ordergetshipmentaddress)
  * [Order#updateShipmentAddress](#orderupdateshipmentaddress)
  * [Order#getPing](#ordergetping)
  * [Order#voiceCallback](#ordervoicecallback)
  * [Order#voiceClickToCall](#ordervoiceclicktocall)
 
* [Catalog](#Catalog)
  * [Catalog#deleteSearchKeywords](#catalogdeletesearchkeywords)
  * [Catalog#getSearchKeywords](#cataloggetsearchkeywords)
  * [Catalog#updateSearchKeywords](#catalogupdatesearchkeywords)
  * [Catalog#getAllSearchKeyword](#cataloggetallsearchkeyword)
  * [Catalog#createCustomKeyword](#catalogcreatecustomkeyword)
  * [Catalog#deleteAutocompleteKeyword](#catalogdeleteautocompletekeyword)
  * [Catalog#getAutocompleteKeywordDetail](#cataloggetautocompletekeyworddetail)
  * [Catalog#updateAutocompleteKeyword](#catalogupdateautocompletekeyword)
  * [Catalog#getAutocompleteConfig](#cataloggetautocompleteconfig)
  * [Catalog#createCustomAutocompleteRule](#catalogcreatecustomautocompleterule)
  * [Catalog#getProductBundle](#cataloggetproductbundle)
  * [Catalog#createProductBundle](#catalogcreateproductbundle)
  * [Catalog#getProductBundleDetail](#cataloggetproductbundledetail)
  * [Catalog#updateProductBundle](#catalogupdateproductbundle)
  * [Catalog#getSizeGuides](#cataloggetsizeguides)
  * [Catalog#createSizeGuide](#catalogcreatesizeguide)
  * [Catalog#getSizeGuide](#cataloggetsizeguide)
  * [Catalog#updateSizeGuide](#catalogupdatesizeguide)
  * [Catalog#getCatalogConfiguration](#cataloggetcatalogconfiguration)
  * [Catalog#getConfigurations](#cataloggetconfigurations)
  * [Catalog#createConfigurationProductListing](#catalogcreateconfigurationproductlisting)
  * [Catalog#getConfigurationByType](#cataloggetconfigurationbytype)
  * [Catalog#createConfigurationByType](#catalogcreateconfigurationbytype)
  * [Catalog#getQueryFilters](#cataloggetqueryfilters)
  * [Catalog#getAllCollections](#cataloggetallcollections)
  * [Catalog#createCollection](#catalogcreatecollection)
  * [Catalog#getCollectionDetail](#cataloggetcollectiondetail)
  * [Catalog#deleteCollection](#catalogdeletecollection)
  * [Catalog#updateCollection](#catalogupdatecollection)
  * [Catalog#getCollectionItems](#cataloggetcollectionitems)
  * [Catalog#addCollectionItems](#catalogaddcollectionitems)
  * [Catalog#getCatalogInsights](#cataloggetcataloginsights)
  * [Catalog#getSellerInsights](#cataloggetsellerinsights)
  * [Catalog#createMarketplaceOptin](#catalogcreatemarketplaceoptin)
  * [Catalog#getMarketplaceOptinDetail](#cataloggetmarketplaceoptindetail)
  * [Catalog#getCompanyDetail](#cataloggetcompanydetail)
  * [Catalog#getCompanyBrandDetail](#cataloggetcompanybranddetail)
  * [Catalog#getCompanyMetrics](#cataloggetcompanymetrics)
  * [Catalog#getStoreDetail](#cataloggetstoredetail)
  * [Catalog#getGenderAttribute](#cataloggetgenderattribute)
  * [Catalog#listProductTemplateCategories](#cataloglistproducttemplatecategories)
  * [Catalog#listDepartmentsData](#cataloglistdepartmentsdata)
  * [Catalog#getDepartmentData](#cataloggetdepartmentdata)
  * [Catalog#listProductTemplate](#cataloglistproducttemplate)
  * [Catalog#validateProductTemplate](#catalogvalidateproducttemplate)
  * [Catalog#downloadProductTemplateViews](#catalogdownloadproducttemplateviews)
  * [Catalog#downloadProductTemplateView](#catalogdownloadproducttemplateview)
  * [Catalog#validateProductTemplateSchema](#catalogvalidateproducttemplateschema)
  * [Catalog#listHSNCodes](#cataloglisthsncodes)
  * [Catalog#listProductTemplateExportDetails](#cataloglistproducttemplateexportdetails)
  * [Catalog#listTemplateBrandTypeValues](#cataloglisttemplatebrandtypevalues)
  * [Catalog#listCategories](#cataloglistcategories)
  * [Catalog#createCategories](#catalogcreatecategories)
  * [Catalog#getCategoryData](#cataloggetcategorydata)
  * [Catalog#updateCategory](#catalogupdatecategory)
  * [Catalog#getProducts](#cataloggetproducts)
  * [Catalog#createProduct](#catalogcreateproduct)
  * [Catalog#deleteProduct](#catalogdeleteproduct)
  * [Catalog#getProduct](#cataloggetproduct)
  * [Catalog#editProduct](#catalogeditproduct)
  * [Catalog#getProductValidation](#cataloggetproductvalidation)
  * [Catalog#getProductSize](#cataloggetproductsize)
  * [Catalog#getProductBulkUploadHistory](#cataloggetproductbulkuploadhistory)
  * [Catalog#updateProductAssetsInBulk](#catalogupdateproductassetsinbulk)
  * [Catalog#deleteProductBulkJob](#catalogdeleteproductbulkjob)
  * [Catalog#createProductsInBulk](#catalogcreateproductsinbulk)
  * [Catalog#getCompanyTags](#cataloggetcompanytags)
  * [Catalog#getProductAssetsInBulk](#cataloggetproductassetsinbulk)
  * [Catalog#createProductAssetsInBulk](#catalogcreateproductassetsinbulk)
  * [Catalog#deleteSize](#catalogdeletesize)
  * [Catalog#getInventory](#cataloggetinventory)
  * [Catalog#addInventory](#catalogaddinventory)
  * [Catalog#deleteInventory](#catalogdeleteinventory)
  * [Catalog#getInventoryBulkUploadHistory](#cataloggetinventorybulkuploadhistory)
  * [Catalog#createBulkInventoryJob](#catalogcreatebulkinventoryjob)
  * [Catalog#deleteBulkInventoryJob](#catalogdeletebulkinventoryjob)
  * [Catalog#createBulkInventory](#catalogcreatebulkinventory)
  * [Catalog#getInventoryExport](#cataloggetinventoryexport)
  * [Catalog#createInventoryExportJob](#catalogcreateinventoryexportjob)
  * [Catalog#exportInventoryConfig](#catalogexportinventoryconfig)
  * [Catalog#getAllHsnCodes](#cataloggetallhsncodes)
  * [Catalog#createHsnCode](#catalogcreatehsncode)
  * [Catalog#getHsnCode](#cataloggethsncode)
  * [Catalog#updateHsnCode](#catalogupdatehsncode)
  * [Catalog#bulkHsnCode](#catalogbulkhsncode)
  * [Catalog#getApplicationBrands](#cataloggetapplicationbrands)
  * [Catalog#getDepartments](#cataloggetdepartments)
  * [Catalog#getCategories](#cataloggetcategories)
  * [Catalog#getAppicationProducts](#cataloggetappicationproducts)
  * [Catalog#getProductDetailBySlug](#cataloggetproductdetailbyslug)
 
* [CompanyProfile](#CompanyProfile)
  * [CompanyProfile#cbsOnboardGet](#companyprofilecbsonboardget)
  * [CompanyProfile#updateCompany](#companyprofileupdatecompany)
  * [CompanyProfile#getCompanyMetrics](#companyprofilegetcompanymetrics)
  * [CompanyProfile#editBrand](#companyprofileeditbrand)
  * [CompanyProfile#getBrand](#companyprofilegetbrand)
  * [CompanyProfile#createBrand](#companyprofilecreatebrand)
  * [CompanyProfile#getBrands](#companyprofilegetbrands)
  * [CompanyProfile#createCompanyBrandMapping](#companyprofilecreatecompanybrandmapping)
  * [CompanyProfile#getLocations](#companyprofilegetlocations)
  * [CompanyProfile#createLocation](#companyprofilecreatelocation)
  * [CompanyProfile#updateLocation](#companyprofileupdatelocation)
  * [CompanyProfile#getLocationDetail](#companyprofilegetlocationdetail)
  * [CompanyProfile#createLocationBulk](#companyprofilecreatelocationbulk)
 
* [FileStorage](#FileStorage)
  * [FileStorage#startUpload](#filestoragestartupload)
  * [FileStorage#completeUpload](#filestoragecompleteupload)
  * [FileStorage#appStartUpload](#filestorageappstartupload)
  * [FileStorage#appCompleteUpload](#filestorageappcompleteupload)
  * [FileStorage#getSignUrls](#filestoragegetsignurls)
  * [FileStorage#copyFiles](#filestoragecopyfiles)
  * [FileStorage#appCopyFiles](#filestorageappcopyfiles)
  * [FileStorage#browse](#filestoragebrowse)
  * [FileStorage#browse](#filestoragebrowse)
  * [FileStorage#proxy](#filestorageproxy)
 
* [Share](#Share)
  * [Share#createShortLink](#sharecreateshortlink)
  * [Share#getShortLinks](#sharegetshortlinks)
  * [Share#getShortLinkByHash](#sharegetshortlinkbyhash)
  * [Share#updateShortLinkById](#shareupdateshortlinkbyid)
 
* [Inventory](#Inventory)
  * [Inventory#getJobsByCompany](#inventorygetjobsbycompany)
  * [Inventory#updateJob](#inventoryupdatejob)
  * [Inventory#createJob](#inventorycreatejob)
  * [Inventory#getJobByCompanyAndIntegration](#inventorygetjobbycompanyandintegration)
  * [Inventory#getJobConfigDefaults](#inventorygetjobconfigdefaults)
  * [Inventory#getJobByCode](#inventorygetjobbycode)
  * [Inventory#getJobCodesByCompanyAndIntegration](#inventorygetjobcodesbycompanyandintegration)
 
* [Configuration](#Configuration)
  * [Configuration#getBuildConfig](#configurationgetbuildconfig)
  * [Configuration#updateBuildConfig](#configurationupdatebuildconfig)
  * [Configuration#getPreviousVersions](#configurationgetpreviousversions)
  * [Configuration#getAppFeatures](#configurationgetappfeatures)
  * [Configuration#updateAppFeatures](#configurationupdateappfeatures)
  * [Configuration#getAppBasicDetails](#configurationgetappbasicdetails)
  * [Configuration#updateAppBasicDetails](#configurationupdateappbasicdetails)
  * [Configuration#getAppContactInfo](#configurationgetappcontactinfo)
  * [Configuration#updateAppContactInfo](#configurationupdateappcontactinfo)
  * [Configuration#getAppApiTokens](#configurationgetappapitokens)
  * [Configuration#updateAppApiTokens](#configurationupdateappapitokens)
  * [Configuration#getAppCompanies](#configurationgetappcompanies)
  * [Configuration#getAppStores](#configurationgetappstores)
  * [Configuration#getInventoryConfig](#configurationgetinventoryconfig)
  * [Configuration#updateInventoryConfig](#configurationupdateinventoryconfig)
  * [Configuration#partiallyUpdateInventoryConfig](#configurationpartiallyupdateinventoryconfig)
  * [Configuration#getAppCurrencyConfig](#configurationgetappcurrencyconfig)
  * [Configuration#updateAppCurrencyConfig](#configurationupdateappcurrencyconfig)
  * [Configuration#getOrderingStoresByFilter](#configurationgetorderingstoresbyfilter)
  * [Configuration#updateOrderingStoreConfig](#configurationupdateorderingstoreconfig)
  * [Configuration#getDomains](#configurationgetdomains)
  * [Configuration#addDomain](#configurationadddomain)
  * [Configuration#removeDomainById](#configurationremovedomainbyid)
  * [Configuration#changeDomainType](#configurationchangedomaintype)
  * [Configuration#getDomainStatus](#configurationgetdomainstatus)
  * [Configuration#createApplication](#configurationcreateapplication)
  * [Configuration#getApplications](#configurationgetapplications)
  * [Configuration#getApplicationById](#configurationgetapplicationbyid)
  * [Configuration#getCurrencies](#configurationgetcurrencies)
  * [Configuration#getDomainAvailibility](#configurationgetdomainavailibility)
  * [Configuration#getIntegrationById](#configurationgetintegrationbyid)
  * [Configuration#getAvailableOptIns](#configurationgetavailableoptins)
  * [Configuration#getSelectedOptIns](#configurationgetselectedoptins)
  * [Configuration#getIntegrationLevelConfig](#configurationgetintegrationlevelconfig)
  * [Configuration#getIntegrationByLevelId](#configurationgetintegrationbylevelid)
  * [Configuration#getLevelActiveIntegrations](#configurationgetlevelactiveintegrations)
  * [Configuration#getBrandsByCompany](#configurationgetbrandsbycompany)
  * [Configuration#getCompanyByBrands](#configurationgetcompanybybrands)
  * [Configuration#getStoreByBrands](#configurationgetstorebybrands)
  * [Configuration#getOtherSellerApplications](#configurationgetothersellerapplications)
  * [Configuration#getOtherSellerApplicationById](#configurationgetothersellerapplicationbyid)
  * [Configuration#optOutFromApplication](#configurationoptoutfromapplication)
 
* [Cart](#Cart)
  * [Cart#getCoupons](#cartgetcoupons)
  * [Cart#createCoupon](#cartcreatecoupon)
  * [Cart#getCouponById](#cartgetcouponbyid)
  * [Cart#updateCoupon](#cartupdatecoupon)
  * [Cart#updateCouponPartially](#cartupdatecouponpartially)
 
* [Rewards](#Rewards)
  * [Rewards#getGiveaways](#rewardsgetgiveaways)
  * [Rewards#createGiveaway](#rewardscreategiveaway)
  * [Rewards#getGiveawayByID](#rewardsgetgiveawaybyid)
  * [Rewards#updateGiveaway](#rewardsupdategiveaway)
  * [Rewards#getOffers](#rewardsgetoffers)
  * [Rewards#getOfferByName](#rewardsgetofferbyname)
  * [Rewards#updateOfferByName](#rewardsupdateofferbyname)
  * [Rewards#getUserAvailablePoints](#rewardsgetuseravailablepoints)
  * [Rewards#updateUserStatus](#rewardsupdateuserstatus)
  * [Rewards#getUserPointsHistory](#rewardsgetuserpointshistory)
 
* [Analytics](#Analytics)
  * [Analytics#getStatiscticsGroups](#analyticsgetstatiscticsgroups)
  * [Analytics#getStatiscticsGroupComponents](#analyticsgetstatiscticsgroupcomponents)
  * [Analytics#getComponentStatsCSV](#analyticsgetcomponentstatscsv)
  * [Analytics#getComponentStatsPDF](#analyticsgetcomponentstatspdf)
  * [Analytics#getComponentStats](#analyticsgetcomponentstats)
  * [Analytics#getAbandonCartList](#analyticsgetabandoncartlist)
  * [Analytics#getAbandonCartsCSV](#analyticsgetabandoncartscsv)
  * [Analytics#getAbandonCartDetail](#analyticsgetabandoncartdetail)
  * [Analytics#createExportJob](#analyticscreateexportjob)
  * [Analytics#getExportJobStatus](#analyticsgetexportjobstatus)
  * [Analytics#getLogsList](#analyticsgetlogslist)
  * [Analytics#searchLogs](#analyticssearchlogs)
 
* [Discount](#Discount)
  * [Discount#getDiscounts](#discountgetdiscounts)
  * [Discount#createDiscount](#discountcreatediscount)
  * [Discount#getDiscount](#discountgetdiscount)
  * [Discount#updateDiscount](#discountupdatediscount)
  * [Discount#validateDiscountFile](#discountvalidatediscountfile)
  * [Discount#downloadDiscountFile](#discountdownloaddiscountfile)
  * [Discount#getValidationJob](#discountgetvalidationjob)
  * [Discount#cancelValidationJob](#discountcancelvalidationjob)
  * [Discount#getDownloadJob](#discountgetdownloadjob)
  * [Discount#cancelDownloadJob](#discountcanceldownloadjob)
 
* [Partner](#Partner)
  * [Partner#addProxyPath](#partneraddproxypath)
  * [Partner#removeProxyPath](#partnerremoveproxypath)
 
* [Webhook](#Webhook)
  * [Webhook#getSubscribersByCompanyAndEventId](#webhookgetsubscribersbycompanyandeventid)
  * [Webhook#registerSubscriberToEvent](#webhookregistersubscribertoevent)
  * [Webhook#updateSubscriberConfig](#webhookupdatesubscriberconfig)
 

---
---



## Lead


#### getTickets
Gets the list of company level tickets and/or ticket filters depending on query params


```java
lead.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID for which the data will be returned |   
| items | Boolean? | Decides that the reponse will contain the list of tickets |   
| filters | Boolean? | Decides that the reponse will contain the ticket filters |   
| q | String? | Search through ticket titles and description |   
| status | String? | Filter tickets on status |   
| priority | String? | Filter tickets on priority |   
| category | String? | Filter tickets on category |   
| pageNo | Integer? | The page number to navigate through the given set of results. |   
| pageSize | Integer? | Number of items to retrieve in each page. Default is 12. |  



Gets the list of company level tickets and/or ticket filters

*Success Response*



Success


Schema: `TicketList`






---


#### createTicket
Creates a company level ticket


```java
lead.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID for which the data will be returned |  



Creates a company level ticket

*Success Response*



Success


Schema: `Ticket`






---


#### getTickets
Gets the list of Application level Tickets and/or ticket filters depending on query params


```java
lead.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID of the application |   
| applicationId | String? | Application ID for which the data will be returned |   
| items | Boolean? | Decides that the reponse will contain the list of tickets |   
| filters | Boolean? | Decides that the reponse will contain the ticket filters |   
| q | String? | Search through ticket titles and description |   
| status | String? | Filter tickets on status |   
| priority | String? | Filter tickets on priority |   
| category | String? | Filter tickets on category |  



Gets the list of Application level Tickets and/or ticket filters

*Success Response*



Success


Schema: `TicketList`






---


#### getTicket
Retreives ticket details of a company level ticket with ticket ID


```java
lead.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID for which the data will be returned |   
| id | String? | Tiket ID of the ticket to be fetched |  



Retreives ticket details of a company level ticket

*Success Response*



Success


Schema: `Ticket`






---


#### editTicket
Edits ticket details of a company level ticket


```java
lead.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID for ticket |   
| id | String? | Ticket ID of ticket to be edited |  



Edits ticket details of a company level ticket such as status, priority, category, tags, attachments, assigne & ticket content changes

*Success Response*



Success


Schema: `Ticket`






---


#### getTicket
Retreives ticket details of a application level ticket


```java
lead.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID of the application |   
| applicationId | String? | Application ID for which the data will be returned |   
| id | String? | Tiket ID of the ticket to be fetched |  



Retreives ticket details of a application level ticket with ticket ID

*Success Response*



Success


Schema: `Ticket`






---


#### editTicket
Edits ticket details of a application level ticket


```java
lead.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID of the application |   
| applicationId | String? | Application ID for ticket |   
| id | String? | Ticket ID of ticket to be edited |  



Edits ticket details of a application level ticket such as status, priority, category, tags, attachments, assigne & ticket content changes

*Success Response*



Success


Schema: `Ticket`






---


#### createHistory
Create history for specific company level ticket


```java
lead.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID for ticket |   
| id | String? | Ticket ID for which history is created |  



Create history for specific company level ticket, this history is seen on ticket detail page, this can be comment, log or rating.

*Success Response*



Success


Schema: `TicketHistory`






---


#### getTicketHistory
Gets history list for specific company level ticket


```java
lead.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID for ticket |   
| id | String? | Ticket ID for which history is to be fetched |  



Gets history list for specific company level ticket, this history is seen on ticket detail page, this can be comment, log or rating.

*Success Response*



Success


Schema: `TicketHistoryList`






---


#### createHistory
Create history for specific application level ticket


```java
lead.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID of the application |   
| applicationId | String? | Application ID for ticket |   
| id | String? | Ticket ID for which history is created |  



Create history for specific application level ticket, this history is seen on ticket detail page, this can be comment, log or rating.

*Success Response*



Success


Schema: `TicketHistory`






---


#### getTicketHistory
Gets history list for specific application level ticket


```java
lead.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID of application |   
| applicationId | String? | Application ID for ticket |   
| id | String? | Ticket ID for which history is to be fetched |  



Gets history list for specific application level ticket, this history is seen on ticket detail page, this can be comment, log or rating.

*Success Response*



Success


Schema: `TicketHistoryList`






---


#### getCustomForm
Get specific custom form using it's slug


```java
lead.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID of the application |   
| applicationId | String? | Application ID for the form |   
| slug | String? | Slug of form whose response is getting submitted |  



Get specific custom form using it's slug, this is used to view the form.

*Success Response*



Success


Schema: `CustomForm`






---


#### editCustomForm
Edit the given custom form


```java
lead.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID of the application |   
| applicationId | String? | Application ID for the form |   
| slug | String? | Slug of form whose response is getting submitted |  



Edit the given custom form field such as adding or deleting input, assignee, title, decription, notification and polling information.

*Success Response*



Success


Schema: `CustomForm`






---


#### getCustomForms
Get list of custom form


```java
lead.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID of the application |   
| applicationId | String? | Application ID for the form |  



Get list of custom form for given application

*Success Response*



Success


Schema: `CustomFormList`






---


#### createCustomForm
Creates a new custom form


```java
lead.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID of the application |   
| applicationId | String? | Application ID for the form |  



Creates a new custom form for given application

*Success Response*



Success


Schema: `CustomForm`






---


#### getTokenForVideoRoom
Get Token to join a specific Video Room using it's unqiue name


```java
lead.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id for video room |   
| uniqueName | String? | Unique name of video room |  



Get Token to join a specific Video Room using it's unqiue name, this Token is your ticket to Room and also creates your identity there.

*Success Response*



Success


Schema: `GetTokenForVideoRoomResponse`






---


#### getTokenForVideoRoom
Get Token to join a specific Video Room using it's unqiue name


```java
lead.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID of the application |   
| applicationId | String? | Application ID for video room |   
| uniqueName | String? | Unique name of video room |  



Get Token to join a specific Video Room using it's unqiue name, this Token is your ticket to Room and also creates your identity there.

*Success Response*



Success


Schema: `GetTokenForVideoRoomResponse`






---


#### getVideoParticipants
Get participants of a specific Video Room using it's unique name


```java
lead.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id for video room |   
| uniqueName | String? | Unique name of Video Room |  



Get participants of a specific Video Room using it's unique name, this can be used to check if people are already there in the room and also to show their names.

*Success Response*



Success


Schema: `GetParticipantsInsideVideoRoomResponse`






---


#### getVideoParticipants
Get participants of a specific Video Room using it's unique name


```java
lead.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID of the application |   
| applicationId | String? | Application ID for video room |   
| uniqueName | String? | Unique name of Video Room |  



Get participants of a specific Video Room using it's unique name, this can be used to check if people are already there in the room and also to show their names.

*Success Response*



Success


Schema: `GetParticipantsInsideVideoRoomResponse`






---


#### openVideoRoom
Open a video room.


```java
lead.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID of the application |   
| applicationId | String? | Application ID for video room |  



Open a video room.

*Success Response*



Success


Schema: `CreateVideoRoomResponse`






---


#### closeVideoRoom
Close the video room and force all participants to leave.


```java
lead.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID of the application |   
| applicationId | String? | Application ID for video room |   
| uniqueName | String? | Unique name of Video Room |  



Close the video room and force all participants to leave.

*Success Response*



Success


Schema: `CloseVideoRoomResponse`






---



---
---


## Feedback


#### getAttributes
Get list of attribute data


```java
feedback.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | company id |   
| applicationId | String? | application id |   
| pageNo | Integer? | pagination page no |   
| pageSize | Integer? | pagination page size |  



Provides a list of all attribute data.

*Success Response*



ok


Schema: `FeedbackAttributes`





Bad request


Schema: `FeedbackError`






---


#### getCustomerReviews
Get list of customer reviews [admin]


```java
feedback.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | company id |   
| applicationId | String? | application id |   
| id | String? | review id |   
| entityId | String? | entity id |   
| entityType | String? | entity type |   
| userId | String? | user id |   
| media | String? | media type e.g. image | video | video_file | video_link |   
| rating | List<Double>? | rating filter, 1-5 |   
| attributeRating | List<String>? | attribute rating filter with ma,e of attribute |   
| facets | Boolean? | facets (true|false) |   
| sort | String? | sort by : default | top | recent |   
| next | String? | pagination next |   
| start | String? | pagination start |   
| limit | String? | pagination limit |   
| count | String? | pagination count |   
| pageId | String? | pagination page id |   
| pageSize | Integer? | pagination page size |  



The endpoint provides a list of customer reviews based on entity and provided filters

*Success Response*



Success


Schema: `GetReviewResponse`





Bad Request


Schema: `FeedbackError`






---


#### updateApprove
update approve details


```java
feedback.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | company id |   
| applicationId | String? | application id |   
| reviewId | String? | review id |  



The is used to update approve details like status and description text

*Success Response*



ok


Schema: `UpdateResponse`





Bad request


Schema: `FeedbackError`






---


#### getHistory
get history details


```java
feedback.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | company id |   
| applicationId | String? | application id |   
| reviewId | String? | review id |  



The is used to get the history details like status and description text

*Success Response*



ok


Schema: `List<ActivityDump>`





Bad request


Schema: `FeedbackError`






---


#### getApplicationTemplates
Get list of templates


```java
feedback.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | company id |   
| applicationId | String? | application id |   
| pageId | String? | pagination page id |   
| pageSize | Integer? | pagination page size |  



Get all templates of application

*Success Response*



Success


Schema: `TemplateGetResponse`





Bad Request


Schema: `FeedbackError`






---


#### createTemplate
Create a new template


```java
feedback.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | company id |   
| applicationId | String? | application id |  



Create a new template for review with following data:
- Enable media, rating and review
- Rating - active/inactive/selected rate choices, attributes, text on rate, comment for each rate, type
- Review - header, title, description, image and video meta, enable votes

*Success Response*



Success


Schema: `InsertResponse`





Bad Request


Schema: `FeedbackError`






---


#### getTemplateById
Get a template by ID


```java
feedback.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | company id |   
| applicationId | String? | application id |   
| id | String? | template id |  



Get the template for product or l3 type by ID

*Success Response*



Success


Schema: `Template`





Bad Request


Schema: `FeedbackError`






---


#### updateTemplate
Update a template's status


```java
feedback.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | company id |   
| applicationId | String? | application id |   
| id | String? | template id |  



Update existing template status, active/archive

*Success Response*



Success


Schema: `UpdateResponse`





Bad Request


Schema: `FeedbackError`






---


#### updateTemplateStatus
Update a template's status


```java
feedback.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | company id |   
| applicationId | String? | application id |   
| id | String? | template id |  



Update existing template status, active/archive

*Success Response*



Success


Schema: `UpdateResponse`





Bad Request


Schema: `FeedbackError`






---



---
---


## Theme


#### getAllPages
Get all pages of a theme


```java
theme.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| themeId | String? | ID of the theme to be retrieved |  



Use this API to retrieve all the available pages of a theme by its ID.

*Success Response*



Success. Returns an array all the pages of the theme. Refer `AllAvailablePageSchema` for more details.


Schema: `AllAvailablePageSchema`








Schema: `BlitzkriegApiError`








Schema: `BlitzkriegInternalServerError`






---


#### createPage
Create a page 


```java
theme.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| themeId | String? | ID of the theme |  



Use this API to create a page for a theme by its ID.

*Success Response*



Success. Returns the page of the theme. Refer `AvailablePageSchema` for more details.


Schema: `AvailablePageSchema`








Schema: `BlitzkriegApiError`








Schema: `BlitzkriegInternalServerError`






---


#### updateMultiplePages
Update multiple pages of a theme


```java
theme.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| themeId | String? | ID of the theme to be retrieved |  



Use this API to update multiple pages of a theme by its ID.

*Success Response*



Success. Returns an array all the pages of the theme. Refer `AllAvailablePageSchema` for more details.


Schema: `AllAvailablePageSchema`








Schema: `BlitzkriegApiError`








Schema: `BlitzkriegInternalServerError`






---


#### getPage
Get page of a theme


```java
theme.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| themeId | String? | ID of the theme to be retrieved |   
| pageValue | String? | Value of the page to be retrieved |  



Use this API to retrieve a page of a theme.

*Success Response*



Success. Returns an object of the page.  Refer `AvailablePageSchema` for more details.


Schema: `AvailablePageSchema`








Schema: `BlitzkriegApiError`








Schema: `BlitzkriegInternalServerError`






---


#### updatePage
Updates a page 


```java
theme.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| themeId | String? | ID of the theme |   
| pageValue | String? | Value of the page to be updated |  



Use this API to update a page for a theme by its ID.

*Success Response*



Success. Returns a the page of the theme. Refer `AvailablePageSchema` for more details.


Schema: `AvailablePageSchema`








Schema: `BlitzkriegApiError`








Schema: `BlitzkriegInternalServerError`






---


#### deletePage
Deletes a page 


```java
theme.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| themeId | String? | ID of the theme |   
| pageValue | String? | Value of the page to be updated |  



Use this API to delete a page for a theme by its ID and page_value.

*Success Response*



Success. Returns a the page of the theme. Refer `AvailablePageSchema` for more details.


Schema: `AvailablePageSchema`








Schema: `BlitzkriegApiError`








Schema: `BlitzkriegInternalServerError`






---


#### getThemeLibrary
Gets list of themes in theme library


```java
theme.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| pageSize | Integer? | Number of items to retrieve in each page. Default is 10. |   
| pageNo | Integer? | Page number. Default is 1. |  



Gets list of themes in theme library

*Success Response*



Themes list


Schema: `ThemesListingResponseSchema`








Schema: `BlitzkriegApiError`








Schema: `BlitzkriegApiError`






---


#### addToThemeLibrary
Add theme to theme library


```java
theme.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Add theme to theme library

*Success Response*



Theme


Schema: `ThemesSchema`








Schema: `BlitzkriegApiError`








Schema: `BlitzkriegApiError`






---


#### applyTheme
Apply theme


```java
theme.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Apply theme

*Success Response*



Theme


Schema: `ThemesSchema`








Schema: `BlitzkriegApiError`








Schema: `BlitzkriegApiError`






---


#### isUpgradable
Checks if theme is upgradable


```java
theme.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| themeId | String? | Theme ID |  



Checks if theme is upgradable

*Success Response*



Upgradable Theme


Schema: `UpgradableThemeSchema`








Schema: `BlitzkriegApiError`








Schema: `BlitzkriegApiError`






---


#### upgradeTheme
Upgrades theme


```java
theme.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| themeId | String? | Theme ID |  



Upgrades theme

*Success Response*



Upgrades Theme


Schema: `ThemesSchema`








Schema: `BlitzkriegApiError`








Schema: `BlitzkriegApiError`






---


#### getPublicThemes
Gets public themes


```java
theme.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| pageSize | Integer? | Number of items to retrieve in each page. Default is 10. |   
| pageNo | Integer? | Page number. Default is 1. |  



Gets public themes

*Success Response*



Themes list


Schema: `ThemesListingResponseSchema`








Schema: `BlitzkriegApiError`








Schema: `BlitzkriegApiError`






---


#### createTheme
Create new theme


```java
theme.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Create new theme

*Success Response*



Theme


Schema: `ThemesSchema`








Schema: `BlitzkriegApiError`








Schema: `BlitzkriegApiError`






---


#### getAppliedTheme
Get applied theme


```java
theme.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Get applied theme

*Success Response*



Theme


Schema: `ThemesSchema`








Schema: `BlitzkriegApiError`








Schema: `BlitzkriegApiError`






---


#### getFonts
Gets fonts


```java
theme.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Gets fonts

*Success Response*



Fonts list


Schema: `FontsSchema`








Schema: `BlitzkriegApiError`








Schema: `BlitzkriegApiError`






---


#### getThemeById
Gets theme by id


```java
theme.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| themeId | String? | Theme ID |  



Gets theme by id

*Success Response*



Theme


Schema: `ThemesSchema`








Schema: `BlitzkriegApiError`








Schema: `BlitzkriegApiError`






---


#### updateTheme
Update theme


```java
theme.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| themeId | String? | Theme ID |  



Update theme

*Success Response*



Theme


Schema: `ThemesSchema`








Schema: `BlitzkriegApiError`








Schema: `BlitzkriegApiError`






---


#### deleteTheme
Delete theme


```java
theme.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| themeId | String? | Theme ID |  



Delete theme

*Success Response*



Theme


Schema: `ThemesSchema`








Schema: `BlitzkriegApiError`








Schema: `BlitzkriegApiError`






---


#### getThemeForPreview
Gets theme for preview


```java
theme.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| themeId | String? | Theme ID |  



Gets theme for preview

*Success Response*



Theme


Schema: `ThemesSchema`








Schema: `BlitzkriegApiError`








Schema: `BlitzkriegApiError`






---


#### publishTheme
Publish theme


```java
theme.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| themeId | String? | Theme ID |  



Publish theme

*Success Response*



Theme


Schema: `ThemesSchema`








Schema: `BlitzkriegApiError`








Schema: `BlitzkriegApiError`






---


#### unpublishTheme
Unpublish theme


```java
theme.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| themeId | String? | Theme ID |  



Unpublish theme

*Success Response*



Theme


Schema: `ThemesSchema`








Schema: `BlitzkriegApiError`








Schema: `BlitzkriegApiError`






---


#### archiveTheme
Archive theme


```java
theme.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| themeId | String? | Theme ID |  



Archive theme

*Success Response*



Theme


Schema: `ThemesSchema`








Schema: `BlitzkriegApiError`








Schema: `BlitzkriegApiError`






---


#### unarchiveTheme
Unarchive theme


```java
theme.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| themeId | String? | Theme ID |  



Unarchive theme

*Success Response*



Theme


Schema: `ThemesSchema`








Schema: `BlitzkriegApiError`








Schema: `BlitzkriegApiError`






---



---
---


## User


#### getCustomers
Gets list of customers


```java
user.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| q | String? | The search query. This can be a partial or complete name of a either a product, brand or category |   
| pageSize | Integer? | Number of items to retrieve in each page. Default is 10. |   
| pageNo | Integer? | Page number. Default is 1. |  



Used to get application customers list

*Success Response*



Customer list


Schema: `CustomerListResponseSchema`








Schema: `AuthenticationApiError`








Schema: `AuthenticationApiError`






---


#### searchUsers
Search users


```java
user.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| q | String? | The search query. This can be a partial or complete name of a either a product, brand or category |  



Search users

*Success Response*



User list


Schema: `UserSearchResponseSchema`








Schema: `AuthenticationApiError`








Schema: `AuthenticationApiError`






---


#### getPlatformConfig
Get platform config


```java
user.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Used to get platform config

*Success Response*



Platform Config


Schema: `PlatformSchema`








Schema: `AuthenticationApiError`








Schema: `AuthenticationApiError`






---


#### updatePlatformConfig
Update platform config


```java
user.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Used to update platform config

*Success Response*



Platform Config


Schema: `PlatformSchema`








Schema: `AuthenticationApiError`








Schema: `AuthenticationApiError`






---



---
---


## Content


#### getAnnouncementsList
Get annoucements list


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| pageNo | Integer? | Each response will contain **page_no** param, which should be sent back to make pagination work. |   
| pageSize | Integer? | Number of items to retrieve in each page. |  



Get list of announcements

*Success Response*



Success


Schema: `GetAnnouncementListSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### createAnnouncement
Create an annoucement


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Create an announcement

*Success Response*



Success


Schema: `CreateAnnouncementSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### getAnnouncementById
Get annoucement by id


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| announcementId | String? | Announcement ID |  



Get announcement by id

*Success Response*



Success


Schema: `AdminAnnouncementSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### updateAnnouncement
Update an annoucement


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| announcementId | String? | Announcement ID |  



Update an announcement

*Success Response*



Success


Schema: `CreateAnnouncementSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### updateAnnouncementSchedule
Update schedule or published status of an annoucement


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| announcementId | String? | Announcement ID |  



Update schedule or published status of an announcement

*Success Response*



Success


Schema: `CreateAnnouncementSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### deleteAnnouncement
Delete annoucement by id


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| announcementId | String? | Announcement ID |  



Delete announcement by id

*Success Response*



Success


Schema: `CreateAnnouncementSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### createBlog
Create blog


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |  



Use this to create a blog.

*Success Response*



Success


Schema: `BlogSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### getBlogs
Get blogs


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| pageNo | Integer? | Each response will contain **page_no** param, which should be sent back to make pagination work. |   
| pageSize | Integer? | Number of items to retrieve in each page. |  



Use this to get blogs.

*Success Response*



Success


Schema: `BlogGetResponse`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### updateBlog
Update blog


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| id | String? | Blog Id |  



Use this to update blog.

*Success Response*



Success


Schema: `BlogSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### deleteBlog
Delete blogs


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| id | String? | Blog Id |  



Use this to delete blogs.

*Success Response*



Success


Schema: `BlogSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### getComponentById
Get components by component Id


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| slug | String? | slug of page to be fetched |  



The endpoint fetches the component by component Id

*Success Response*



A JSON object with components


Schema: `BlogSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### getFaqCategories
Get FAQ categories list


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Get list of FAQ categories

*Success Response*



Get FAQ Categories


Schema: `GetFaqCategoriesSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### getFaqCategoryBySlugOrId
Get FAQ category by slug or id


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| idOrSlug | String? | Slug or Id of FAQ Category |  



Get FAQ category by slug or id

*Success Response*



Get FAQ Categories


Schema: `GetFaqCategoryBySlugSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### createFaqCategory
Creates a FAQ category


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Add Faq Category

*Success Response*



Create a FAQ Category


Schema: `CreateFaqCategorySchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### updateFaqCategory
Updates a FAQ category


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| id | String? | Faq category ID |  



Update Faq Category

*Success Response*



Update a FAQ Category


Schema: `CreateFaqCategorySchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### deleteFaqCategory
Deletes a FAQ category


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| id | String? | Faq category ID |  



Delete Faq Category

*Success Response*



Delete a FAQ Category


Schema: `FaqSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### getFaqsByCategoryIdOrSlug
Get FAQs of a Faq Category id or slug


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| idOrSlug | String? | Faq category ID or slug |  



Get FAQs of a Faq Category `id` or `slug`

*Success Response*



Get FAQs by slug/id of FAQ Category


Schema: `GetFaqSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### addFaq
Creates FAQs for category whose `id` is specified


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| categoryId | String? | Faq category ID |  



Creates FAQs for category whose `id` is specified

*Success Response*



Create a FAQ for FAQ Category


Schema: `CreateFaqResponseSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### updateFaq
Updates FAQ


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| categoryId | String? | Faq category ID |   
| faqId | String? | Faq ID |  



Updates FAQ

*Success Response*



Update FAQ by id


Schema: `CreateFaqResponseSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### deleteFaq
Delete FAQ


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| categoryId | String? | Faq category ID |   
| faqId | String? | Faq ID |  



Delete FAQ

*Success Response*



Delete FAQ by id


Schema: `CreateFaqResponseSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### getFaqByIdOrSlug
Get frequently asked question


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| idOrSlug | String? | Slug or Id of FAQ |  



Get frequently asked questions list. These will be helpful for users to using website.

*Success Response*



Success


Schema: `CreateFaqResponseSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### getLandingPages
Get landing-pages


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| pageNo | Integer? | Each response will contain **page_no** param, which should be sent back to make pagination work. |   
| pageSize | Integer? | Number of items to retrieve in each page. |  



Use this to get landing-pages.

*Success Response*



Success


Schema: `LandingPageGetResponse`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### createLandingPage
Create landing-page


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Use this to create landing-page.

*Success Response*



Success


Schema: `LandingPageSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### updateLandingPage
Update landing-page


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| id | String? | Landing page ID |  



Use this to update landing-page.

*Success Response*



Success


Schema: `LandingPageSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### deleteLandingPage
Delete landing-page


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| id | String? | Landing page ID |  



Use this to delete landing-page.

*Success Response*



Success


Schema: `LandingPageSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### getLegalInformation
Get legal information


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Get legal information of application, which includes policy, Terms and Conditions, and FAQ information of application.

*Success Response*



Success


Schema: `ApplicationLegal`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### updateLegalInformation
Save legal information


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Save legal information of application, which includes Policy, Terms and Conditions, and FAQ information of application.

*Success Response*



Success


Schema: `ApplicationLegal`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### getNavigations
Get navigations


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| devicePlatform | String? | Device platform |   
| pageNo | Integer? | Each response will contain **page_no** param, which should be sent back to make pagination work. |   
| pageSize | Integer? | Number of items to retrieve in each page. |  



Use this to get navigations.

*Success Response*



Success


Schema: `NavigationGetResponse`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### createNavigation
Create navigation


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Use this to create navigation.

*Success Response*



Success


Schema: `NavigationSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### getDefaultNavigations
Get default navigations


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Use this to get default navigations.

*Success Response*



Success


Schema: `DefaultNavigationResponse`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### getNavigationBySlug
Get navigation by slug


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| slug | String? | Slug |   
| devicePlatform | String? | Device platform |  



Use this to get navigation by slug.

*Success Response*



Success


Schema: `NavigationSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### updateNavigation
Update navigation


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| id | String? | Navigation ID |  



Use this to update navigation.

*Success Response*



Success


Schema: `NavigationSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### deleteNavigation
Delete navigation


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| id | String? | Navigation ID |  



Use this to delete navigation.

*Success Response*



Success


Schema: `NavigationSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### getPageMeta
Get page meta


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |  



Use this to get Page Meta.

*Success Response*



Success


Schema: `PageMetaSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### getPageSpec
Get page spec


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Use this to get page spec.

*Success Response*



Success


Schema: `PageSpec`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### createPage
Create page


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |  



Use this to create a page.

*Success Response*



Success


Schema: `PageSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### getPages
Get pages


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| pageNo | Integer? | Each response will contain **page_no** param, which should be sent back to make pagination work. |   
| pageSize | Integer? | Number of items to retrieve in each page. |  



Use this to get pages.

*Success Response*



Success


Schema: `PageGetResponse`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### createPagePreview
Create page preview


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |  



Use this to create a page preview.

*Success Response*



Success


Schema: `PageSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### updatePagePreview
Update page


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| slug | String? | Page publish slug |  



Use this to update page.

*Success Response*



Success


Schema: `PageSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### updatePage
Update page


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| id | String? | Page Id |  



Use this to update page.

*Success Response*



Success


Schema: `PageSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### deletePage
Delete page


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| id | String? | Page Id |  



Use this to delete page.

*Success Response*



Success


Schema: `PageSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### getPageBySlug
Get pages by component Id


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| slug | String? | Slug of page to be fetched |  



The endpoint fetches the component by component Id

*Success Response*



A JSON object with page


Schema: `PageSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### getSEOConfiguration
Get seo of application


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Get seo of application

*Success Response*



Success


Schema: `SeoComponent`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### updateSEOConfiguration
Update seo of application


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Update seo of application

*Success Response*



Success


Schema: `SeoSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### getSlideshows
Get slideshows


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| devicePlatform | String? | Device platform |   
| pageNo | Integer? | Each response will contain **page_no** param, which should be sent back to make pagination work. |   
| pageSize | Integer? | Number of items to retrieve in each page. |  



Use this to get slideshows.

*Success Response*



Success


Schema: `SlideshowGetResponse`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### createSlideshow
Create slideshow


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Use this to create slideshow.

*Success Response*



Success


Schema: `SlideshowSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### getSlideshowBySlug
Get slideshow by slug


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| slug | String? | Slug |   
| devicePlatform | String? | Device platform |  



Use this to get slideshow by slug.

*Success Response*



Success


Schema: `SlideshowSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### updateSlideshow
Update slideshow


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| id | String? | Slideshow ID |  



Use this to update slideshow.

*Success Response*



Success


Schema: `SlideshowSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### deleteSlideshow
Delete slideshow


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| id | String? | Slideshow ID |  



Use this to delete slideshow.

*Success Response*



Success


Schema: `SlideshowSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### getSupportInformation
Get support information


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Get contact details for customer support. Including emails and phone numbers

*Success Response*



Success


Schema: `Support`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### updateSupportInformation
Update support data of application


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Update support data of application

*Success Response*



Success


Schema: `Support`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### updateInjectableTag
Updates a Tag


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Update tag

*Success Response*



Tags Array


Schema: `TagsSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### deleteAllInjectableTags
Delete tags for application


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Delete tags for application

*Success Response*



Tags Array


Schema: `TagsSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### getInjectableTags
Get tags for application


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Get tags for application

*Success Response*



Tags Array


Schema: `TagsSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### addInjectableTag
Adds a Tag


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Add tag

*Success Response*



Tags Array


Schema: `TagsSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### removeInjectableTag
Removes a Tag


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Remove a particular tag

*Success Response*



Tags Array


Schema: `TagsSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---


#### editInjectableTag
Edits a Tag by Id


```java
content.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| tagId | String? | Tag ID |  



Edits a particular tag

*Success Response*



Tags Array


Schema: `TagsSchema`





Failed


Schema: `APIError`





Failed


Schema: `APIError`






---



---
---


## Assignment


#### createPickupLocation



```java
assignment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |   
| applicationId | String? | Application Id |  



Create a new Pickup point for an application.


*Success Response*



Success Response - Store Updated


Schema: `Success`





Error Response


Schema: `ErrorResponseSchema`






---


#### getPickupLocation



```java
assignment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| q | String? | Search query |   
| pageNo | Integer? | Request a page number |   
| pageSize | Integer? | Request a page size |   
| companyId | Integer? | Company Id |   
| applicationId | String? | Application Id |  



Update list of pickup points for an application.


*Success Response*



Success Response


Schema: `PickupPointResponse`





Error


Schema: `ErrorResponseSchema`






---


#### updatePickupLocation



```java
assignment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| id | Double? | Pickup Point ID |   
| companyId | Integer? | Company Id |   
| applicationId | String? | Application Id |  



Update Pickup Point for an application. Pickup Point once created
can be updated using this API. 'x-application-id'm and request body are required to trigger
a successful update.


*Success Response*



Success Response - Store Updated


Schema: `Success`





Error Response


Schema: `ErrorResponseSchema`






---


#### getPickupLocationById



```java
assignment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| id | Double? | Pickup Point Id |   
| companyId | Integer? | Company Id |   
| applicationId | String? | Application Id |  



This API returns Pickup point data for an id. Returns not found if no data exists for the
store id passed.


*Success Response*



Success Response


Schema: `PickupPointSchema`





Error Response


Schema: `ErrorResponseSchema`






---


#### createPickupConfiguration



```java
assignment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |   
| applicationId | String? | Application Id |  



Create a new pickup configuration for an application id. Only one configuration can be
created per application id.


*Success Response*



Success Response - Store Updated


Schema: `Success`





Error Response


Schema: `ErrorResponseSchema`






---


#### getPickupConfiguration



```java
assignment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |   
| applicationId | String? | Application Id |  



Let pickup configuration for an application. z-application-id is required in
the header to fetch the data.


*Success Response*



Success Response


Schema: `PickupResponse`





Error Response


Schema: `ErrorResponseSchema`






---


#### getAllocationConfiguration



```java
assignment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |   
| applicationId | String? | Application Id |  



Get Shipping configuration for an application. Returns the global shipping configuration
including shipping priority and default strategy, etc. Every application can have one set of
configuration each. The endpoint requires an application id to get the data.


*Success Response*



Success Response


Schema: `ShippingResponse`





Error Response


Schema: `ErrorResponseSchema`






---


#### createAllocationConfiguration



```java
assignment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |   
| applicationId | String? | Application Id |  



Create a new Shipping configuration for an application The configuration is for
all the stores under an application. There can be only one configuration for an
application i.e, for an application configuration can be created only once.


*Success Response*



Success Response - Store Updated


Schema: `Success`





Error Response


Schema: `ErrorResponseSchema`






---


#### updateAllocationConfiguration



```java
assignment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |   
| applicationId | String? | Application Id |  



Update Shipping configuration for an application. Application configuration once created
can be updated using this API. 'x-application-id'm and request body are required to trigger
a successful update.


*Success Response*



Success Response - Store Updated


Schema: `Success`





Error Response


Schema: `ErrorResponseSchema`






---


#### getAllocationLocations



```java
assignment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| q | String? | Search query |   
| pageNo | Integer? | Request a page number |   
| pageSize | Integer? | Request a page size |   
| type | String? | Type can be 'standard' or 'advanced' |   
| companyId | Integer? | Company Id |   
| applicationId | String? | Application Id |  



List Stores of an application. Two types of stores are listed,
some having allocation types as standard and others, advanced.
API has support for pagination, filter by type and search by name.


*Success Response*



Success Response


Schema: `StoreListResponse`





Error Response


Schema: `ErrorResponseSchema`






---


#### getAllocationLocationById



```java
assignment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| id | Double? | Store Id |   
| companyId | Integer? | Company Id |   
| applicationId | String? | Application Id |  



This API returns store data for an id. Returns not found if no data exists for the
store id passed. The data is returned from sixspeed database which includes only the
shipping configuration of the stores including store id and app id.


*Success Response*



Success Response


Schema: `StoreResponse`





Error Response


Schema: `ErrorResponseSchema`






---


#### updateAllocationLocation



```java
assignment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| id | Double? | Store Id |   
| companyId | Integer? | Company Id |   
| applicationId | String? | Application Id |  



A store configuration once created can be updated via this API. Store id in request params
and udpated request body are required to successfully update the store data.


*Success Response*



Success Response - Store Updated


Schema: `Success`





Error Response


Schema: `ErrorResponseSchema`






---


#### createAllocationLocation



```java
assignment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |   
| applicationId | String? | Application Id |  



Create a new store shipping configuratiion. The configuration is stored into the
sixspeed database. One one store data can be created for one store id. Ther can be one
default configuration and multiple non-default ones. The default is not binded with product
tags while others are required to be.


*Success Response*



Success Response - Store Updated


Schema: `Success`





Error Response


Schema: `ErrorResponseSchema`






---


#### getDestinationZones



```java
assignment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| q | String? | Search query |   
| pageNo | Integer? | Request a page number |   
| pageSize | Integer? | Request a page size |   
| companyId | Integer? | Company Id |   
| applicationId | String? | Application Id |  



Get a list of zones created, where every zone has a unique name and id. They can be
of three different types, radius, pincode and country.


*Success Response*



Success Response


Schema: `ZoneListResponse`





Error Response


Schema: `ErrorResponseSchema`






---


#### postDestinationZone



```java
assignment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |   
| applicationId | String? | Application Id |  



This API lets you create a zone which can be used further be mapped with store
configuration rules to defined a shipping rule. Either of the three details need to
be passed, zone_detail, pincode and region.


*Success Response*



Success Response - Zone Created


Schema: `Success`





Internal Server Error


Schema: `ErrorResponseSchema`






---


#### getDestinationZoneById



```java
assignment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| id | Double? | Store Id |   
| companyId | Integer? | Company Id |   
| applicationId | String? | Application Id |  



Returns zone data for the specified zone id. Id is the required parameter and returns
not found if no data is found for the passed zone id.


*Success Response*



Success Response


Schema: `ZoneSchema`





Internal Server Error


Schema: `ErrorResponseSchema`






---


#### updateDestinationZone



```java
assignment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| id | Double? | Store Id |   
| companyId | Integer? | Company Id |   
| applicationId | String? | Application Id |  



Zone once created can be updated using this API. Zone id and request body are the required
data to update a zone.


*Success Response*



Success Response - Zone Updated


Schema: `Success`





Internal Server Error


Schema: `ErrorResponseSchema`






---



---
---


## Billing


#### createSubscriptionCharge
Create subscription charge


```java
billing.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Customer unique id. In case of company it will be company id. |   
| extensionId | String? | Extension _id |  



Register subscription charge for a seller of your extension.

*Success Response*



Success


Schema: `CreateSubscriptionResponse`





Request failed due to invalid data


Schema: `BadRequest`






---


#### getSubscriptionCharge
Get subscription charge details


```java
billing.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Customer unique id. In case of company it will be company id. |   
| extensionId | String? | Extension _id |   
| subscriptionId | String? | Subscription charge _id |  



Get created subscription charge details

*Success Response*



Success


Schema: `EntitySubscription`





Not found


Schema: `ResourceNotFound`






---


#### cancelSubscriptionCharge
Cancel subscription charge


```java
billing.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Customer unique id. In case of company it will be company id. |   
| extensionId | String? | Extension _id |   
| subscriptionId | String? | Subscription charge _id |  



Cancel subscription and attached charges.

*Success Response*



Success


Schema: `EntitySubscription`





Request failed due to invalid data


Schema: `BadRequest`





Resource Not found


Schema: `ResourceNotFound`






---


#### getInvoices
Get invoices


```java
billing.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Customer unique id. In case of company it will be company id. |  



Get invoices.

*Success Response*



Success


Schema: `Invoices`






---


#### getInvoiceById
Get invoice by id


```java
billing.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Customer unique id. In case of company it will be company id. |   
| invoiceId | String? | Invoice id |  



Get invoice by id.

*Success Response*



Success


Schema: `Invoice`






---


#### getCustomerDetail
Get subscription customer detail


```java
billing.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Customer unique id. In case of company it will be company id. |  



Get subscription customer detail.

*Success Response*



Success


Schema: `SubscriptionCustomer`





Resource not found


Schema: `ResourceNotFound`






---


#### upsertCustomerDetail
Upsert subscription customer detail


```java
billing.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Customer unique id. In case of company it will be company id. |  



Upsert subscription customer detail.

*Success Response*



Success


Schema: `SubscriptionCustomer`





Resource not found


Schema: `ResourceNotFound`





Internal server error


Schema: `InternalServerError`






---


#### getSubscription
Get current subscription detail


```java
billing.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Customer unique id. In case of company it will be company id. |  



If subscription is active then it will return is_enabled true and return subscription object. If subscription is not active then is_enabled false and message.


*Success Response*



Success


Schema: `SubscriptionStatus`





Internal server error


Schema: `InternalServerError`






---


#### getFeatureLimitConfig
Get subscription subscription limits


```java
billing.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Customer unique id. In case of company it will be company id. |  



Get subscription subscription limits.

*Success Response*



Success


Schema: `SubscriptionLimit`





Internal server error


Schema: `InternalServerError`






---


#### activateSubscriptionPlan
Activate subscription


```java
billing.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Customer unique id. In case of company it will be company id. |  



It will activate subscription plan for customer

*Success Response*



Success


Schema: `SubscriptionActivateRes`





Resource not found


Schema: `ResourceNotFound`





Internal server error


Schema: `InternalServerError`






---


#### cancelSubscriptionPlan
Cancel subscription


```java
billing.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Customer unique id. In case of company it will be company id. |  



It will cancel current active subscription.

*Success Response*



Success


Schema: `CancelSubscriptionRes`





Resource not found


Schema: `ResourceNotFound`





Internal server error


Schema: `InternalServerError`






---



---
---


## Communication


#### getCampaigns
Get campaigns


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| pageNo | Integer? | Current page no |   
| pageSize | Integer? | Current request items count |   
| sort | HashMap<String,Object>? | To sort based on created_at |  



Get campaigns

*Success Response*



Success


Schema: `Campaigns`






---


#### createCampaign
Create campaign


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |  



Create campaign

*Success Response*



Success


Schema: `Campaign`






---


#### getCampaignById
Get campaign by id


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Campaign id |  



Get campaign by id

*Success Response*



Success


Schema: `Campaign`





Not found


Schema: `NotFound`






---


#### updateCampaignById
Update campaign by id


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Campaign id |  



Update campaign by id

*Success Response*



Success


Schema: `Campaign`





Not found


Schema: `NotFound`






---


#### getStatsOfCampaignById
Get stats of campaign by id


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Campaign id |  



Get stats of campaign by id

*Success Response*



Success


Schema: `GetStats`





Bad request


Schema: `BadRequest`






---


#### getAudiences
Get audiences


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| pageNo | Integer? | Current page no |   
| pageSize | Integer? | Current request items count |   
| sort | HashMap<String,Object>? | To sort based on created_at |  



Get audiences

*Success Response*



Success


Schema: `Audiences`






---


#### createAudience
Create audience


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |  



Create audience

*Success Response*



Success


Schema: `Audience`






---


#### getBigqueryHeaders
Get bigquery headers


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |  



Get bigquery headers

*Success Response*



Success


Schema: `BigqueryHeadersRes`





Bad request


Schema: `BadRequest`






---


#### getAudienceById
Get audience by id


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Audience id |  



Get audience by id

*Success Response*



Success


Schema: `Audience`





Not found


Schema: `NotFound`






---


#### updateAudienceById
Update audience by id


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Audience id |  



Update audience by id

*Success Response*



Success


Schema: `Audience`





Not found


Schema: `NotFound`






---


#### getNSampleRecordsFromCsv
Get n sample records from csv


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |  



Get n sample records from csv

*Success Response*



Success


Schema: `GetNRecordsCsvRes`





Bad request


Schema: `BadRequest`






---


#### getEmailProviders
Get email providers


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| pageNo | Integer? | Current page no |   
| pageSize | Integer? | Current request items count |   
| sort | HashMap<String,Object>? | To sort based on created_at |  



Get email providers

*Success Response*



Success


Schema: `EmailProviders`






---


#### createEmailProvider
Create email provider


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |  



Create email provider

*Success Response*



Success


Schema: `EmailProvider`






---


#### getEmailProviderById
Get email provider by id


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Email provider id |  



Get email provider by id

*Success Response*



Success


Schema: `EmailProvider`






---


#### updateEmailProviderById
Update email provider by id


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Email provider id |  



Update email provider by id

*Success Response*



Success


Schema: `EmailProvider`






---


#### getEmailTemplates
Get email templates


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| pageNo | Integer? | Current page no |   
| pageSize | Integer? | Current request items count |   
| sort | HashMap<String,Object>? | To sort based on created_at |  



Get email templates

*Success Response*



Success


Schema: `EmailTemplates`






---


#### createEmailTemplate
Create email template


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |  



Create email template

*Success Response*



Success


Schema: `EmailTemplateRes`






---


#### getSystemEmailTemplates
Get system email templates


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| pageNo | Integer? | Current page no |   
| pageSize | Integer? | Current request items count |   
| sort | HashMap<String,Object>? | To sort based on created_at |  



Get system email templates

*Success Response*



Success


Schema: `SystemEmailTemplates`






---


#### getEmailTemplateById
Get email template by id


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Email template id |  



Get email template by id

*Success Response*



Success


Schema: `EmailTemplate`






---


#### updateEmailTemplateById
Update email template by id


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Email template id |  



Update email template by id

*Success Response*



Success


Schema: `EmailTemplateRes`






---


#### deleteEmailTemplateById
Delete email template by id


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Email template id |  



Delete email template by id

*Success Response*



Success


Schema: `EmailTemplateDeleteSuccessRes`





Failure


Schema: `EmailTemplateDeleteFailureRes`






---


#### getEventSubscriptions
Get event subscriptions


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| pageNo | Integer? | Current page no |   
| pageSize | Integer? | Current request items count |   
| populate | String? | populate fields |  



Get event subscriptions

*Success Response*



Success


Schema: `EventSubscriptions`






---


#### getJobs
Get jobs


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| pageNo | Integer? | Current page no |   
| pageSize | Integer? | Current request items count |   
| sort | HashMap<String,Object>? | To sort based on created_at |  



Get jobs

*Success Response*



Success


Schema: `Jobs`






---


#### triggerCampaignJob
Trigger campaign job


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |  



Trigger campaign job

*Success Response*



Success


Schema: `TriggerJobResponse`






---


#### getJobLogs
Get job logs


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| pageNo | Integer? | Current page no |   
| pageSize | Integer? | Current request items count |   
| sort | HashMap<String,Object>? | To sort based on created_at |  



Get job logs

*Success Response*



Success


Schema: `JobLogs`






---


#### getCommunicationLogs
Get communication logs


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| pageId | String? | Current page no |   
| pageSize | Integer? | Current request items count |   
| sort | HashMap<String,Object>? | To sort based on _id |   
| query | HashMap<String,Object>? |  |  



Get communication logs

*Success Response*



Success


Schema: `Logs`






---


#### getSystemNotifications
Get system notifications


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| pageNo | Integer? |  |   
| pageSize | Integer? |  |  



Get system notifications

*Success Response*



Success


Schema: `SystemNotifications`






---


#### getSmsProviders
Get sms providers


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| pageNo | Integer? | Current page no |   
| pageSize | Integer? | Current request items count |   
| sort | HashMap<String,Object>? | To sort based on created_at |  



Get sms providers

*Success Response*



Success


Schema: `SmsProviders`






---


#### createSmsProvider
Create sms provider


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |  



Create sms provider

*Success Response*



Success


Schema: `SmsProvider`






---


#### getSmsProviderById
Get sms provider by id


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Sms provider id |  



Get sms provider by id

*Success Response*



Success


Schema: `SmsProvider`






---


#### updateSmsProviderById
Update sms provider by id


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Sms provider id |  



Update sms provider by id

*Success Response*



Success


Schema: `SmsProvider`






---


#### getSmsTemplates
Get sms templates


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| pageNo | Integer? | Current page no |   
| pageSize | Integer? | Current request items count |   
| sort | HashMap<String,Object>? | To sort based on created_at |  



Get sms templates

*Success Response*



Success


Schema: `SmsTemplates`






---


#### createSmsTemplate
Create sms template


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |  



Create sms template

*Success Response*



Success


Schema: `SmsTemplateRes`






---


#### getSmsTemplateById
Get sms template by id


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Sms template id |  



Get sms template by id

*Success Response*



Success


Schema: `SmsTemplate`





Not found


Schema: `NotFound`






---


#### updateSmsTemplateById
Update sms template by id


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Sms template id |  



Update sms template by id

*Success Response*



Success


Schema: `SmsTemplateRes`





Not found


Schema: `NotFound`






---


#### deleteSmsTemplateById
Delete sms template by id


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Sms template id |  



Delete sms template by id

*Success Response*



Success


Schema: `SmsTemplateDeleteSuccessRes`





Failure


Schema: `SmsTemplateDeleteFailureRes`





Not found


Schema: `NotFound`






---


#### getSystemSystemTemplates
Get system sms templates


```java
communication.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| pageNo | Integer? | Current page no |   
| pageSize | Integer? | Current request items count |   
| sort | HashMap<String,Object>? | To sort based on created_at |  



Get system sms templates

*Success Response*



Success


Schema: `SystemSmsTemplates`






---



---
---


## Payment


#### getBrandPaymentGatewayConfig
Get All Brand Payment Gateway Config Secret


```java
payment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |   
| applicationId | String? | Application id |  



Get All Brand Payment Gateway Config Secret

*Success Response*



Refund Transfer Mode


Schema: `PaymentGatewayConfigResponse`





Internal Server Error


Schema: `ErrorCodeDescription`





Internal Server Error


Schema: `ErrorCodeDescription`






---


#### saveBrandPaymentGatewayConfig
Save Config Secret For Brand Payment Gateway


```java
payment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |   
| applicationId | String? | Application id |  



Save Config Secret For Brand Payment Gateway

*Success Response*



Save Config Secret For Brand Payment Gateway Success Response.


Schema: `PaymentGatewayToBeReviewed`





Bad Request Error


Schema: `HttpErrorCodeAndResponse`





Internal Server Error


Schema: `HttpErrorCodeAndResponse`






---


#### updateBrandPaymentGatewayConfig
Save Config Secret For Brand Payment Gateway


```java
payment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |   
| applicationId | String? | Application id |  



Save Config Secret For Brand Payment Gateway

*Success Response*



Save Config Secret For Brand Payment Gateway Success Response.


Schema: `PaymentGatewayToBeReviewed`





Bad Request Error


Schema: `HttpErrorCodeAndResponse`





Internal Server Error


Schema: `HttpErrorCodeAndResponse`






---


#### getPaymentModeRoutes
Get All Valid Payment Options


```java
payment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |   
| applicationId | String? | Application id |   
| refresh | Boolean? |  |   
| requestType | String? |  |  



Use this API to get Get All Valid Payment Options for making payment

*Success Response*



Success


Schema: `PaymentOptionsResponse`





Bad Request Error


Schema: `HttpErrorCodeAndResponse`





Internal Server Error


Schema: `HttpErrorCodeAndResponse`






---


#### getAllPayouts
Get All Payouts


```java
payment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |   
| uniqueExternalId | String? | Fetch payouts using unique external id |  



Get All Payouts

*Success Response*



payouts response object


Schema: `PayoutsResponse`





Bad Request Error


Schema: `HttpErrorCodeAndResponse`





Internal Server Error


Schema: `HttpErrorCodeAndResponse`






---


#### savePayout
Save Payout


```java
payment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |  



Save Payout

*Success Response*



save payout response object


Schema: `PayoutResponse`





Bad Request Error


Schema: `HttpErrorCodeAndResponse`





Internal Server Error


Schema: `HttpErrorCodeAndResponse`






---


#### updatePayout
Update Payout


```java
payment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |   
| uniqueTransferNo | String? | Unique transfer id |  



Update Payout

*Success Response*



save payout response object


Schema: `UpdatePayoutResponse`





Bad Request Error


Schema: `HttpErrorCodeAndResponse`





Internal Server Error


Schema: `HttpErrorCodeAndResponse`






---


#### activateAndDectivatePayout
Partial Update Payout


```java
payment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |   
| uniqueTransferNo | String? | Unique transfer id |  



Partial Update Payout

*Success Response*



save payout response object


Schema: `UpdatePayoutResponse`





Bad Request Error


Schema: `HttpErrorCodeAndResponse`





Internal Server Error


Schema: `HttpErrorCodeAndResponse`






---


#### deletePayout
Delete Payout


```java
payment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |   
| uniqueTransferNo | String? | Unique transfer id |  



Delete Payout

*Success Response*



delete payout response object


Schema: `DeletePayoutResponse`





Bad Request Error


Schema: `HttpErrorCodeAndResponse`





Internal Server Error


Schema: `HttpErrorCodeAndResponse`






---


#### getSubscriptionPaymentMethod
List Subscription Payment Method


```java
payment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |  



Get all  Subscription  Payment Method

*Success Response*



List Subscription Payment Method Response


Schema: `SubscriptionPaymentMethodResponse`





Bad Request Error


Schema: `HttpErrorCodeAndResponse`





Internal Server Error


Schema: `HttpErrorCodeAndResponse`






---


#### deleteSubscriptionPaymentMethod
Delete Subscription Payment Method


```java
payment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |   
| uniqueExternalId | String? |  |   
| paymentMethodId | String? |  |  



Uses this api to Delete Subscription Payment Method

*Success Response*



Delete Subscription Payment Method Response.


Schema: `DeleteSubscriptionPaymentMethodResponse`





Internal Server Error


Schema: `HttpErrorCodeAndResponse`






---


#### getSubscriptionConfig
List Subscription Config


```java
payment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |  



Get all  Subscription Config details

*Success Response*



List Subscription Config Response


Schema: `SubscriptionConfigResponse`





Bad Request Error


Schema: `HttpErrorCodeAndResponse`





Internal Server Error


Schema: `HttpErrorCodeAndResponse`






---


#### saveSubscriptionSetupIntent
Save Subscription Setup Intent


```java
payment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |  



Uses this api to Save Subscription Setup Intent

*Success Response*



Save Subscription Setup Intent Response.


Schema: `SaveSubscriptionSetupIntentResponse`





Bad Request Error


Schema: `HttpErrorCodeAndResponse`





Internal Server Error


Schema: `HttpErrorCodeAndResponse`






---


#### addBeneficiaryDetails
Save bank details for cancelled/returned order


```java
payment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |   
| applicationId | String? | Application id |  



Use this API to save bank details for returned/cancelled order to refund amount in his account.

*Success Response*



Success


Schema: `RefundAccountResponse`





Bad Request Error


Schema: `NotFoundResourceError`





Internal Server Error


Schema: `HttpErrorCodeAndResponse`






---


#### verifyIfscCode
Ifsc Code Verification


```java
payment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |   
| ifscCode | String? |  |  



Get True/False for correct IFSC Code for adding bank details for refund

*Success Response*



Bank details on correct Ifsc Code


Schema: `IfscCodeResponse`





Bad Request Error


Schema: `NotFoundResourceError`





Internal Server Error


Schema: `ErrorCodeDescription`






---


#### getUserOrderBeneficiaries
List Order Beneficiary


```java
payment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| orderId | String? |  |   
| companyId | Integer? | Company Id |   
| applicationId | String? | Application id |  



Get all active  beneficiary details added by the user for refund

*Success Response*



List Order Beneficiary


Schema: `OrderBeneficiaryResponse`





Bad Request Error


Schema: `NotFoundResourceError`





Internal Server Error


Schema: `HttpErrorCodeAndResponse`






---


#### getUserBeneficiaries
List User Beneficiary


```java
payment.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| orderId | String? |  |   
| companyId | Integer? | Company Id |   
| applicationId | String? | Application id |  



Get all active  beneficiary details added by the user for refund

*Success Response*



List User Beneficiary


Schema: `OrderBeneficiaryResponse`





Bad Request Error


Schema: `NotFoundResourceError`





Internal Server Error


Schema: `HttpErrorCodeAndResponse`






---



---
---


## Order


#### shipmentStatusUpdate
Update status of Shipment


```java
order.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |  



Update Shipment Status

*Success Response*



Success


Schema: `UpdateShipmentStatusResponse`





API Error


Schema: `ApefaceApiError`





Internal Server Error


Schema: `ApefaceApiError`






---


#### activityStatus
Get Activity Status


```java
order.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| bagId | String? | Bag Id |  



Get Activity Status

*Success Response*



Success


Schema: `GetActivityStatus`





API Error


Schema: `ApefaceApiError`





Internal Server Error


Schema: `ApefaceApiError`






---


#### storeProcessShipmentUpdate
Update Store Process-Shipment


```java
order.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |  



Update Store Process-Shipment

*Success Response*



Success


Schema: `UpdateProcessShipmenstRequestResponse`





API Error


Schema: `ApefaceApiError`





Internal Server Error


Schema: `ApefaceApiError`






---


#### checkRefund
Check Refund is available or not


```java
order.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| shipmentId | String? | Shipment Id |  



Check Refund is available or not

*Success Response*



Success


Schema: `HashMap<String,Object>`





API Error


Schema: `ApefaceApiError`





Internal Server Error


Schema: `ApefaceApiError`






---


#### getOrdersByCompanyId
Get Orders for company based on Company Id


```java
order.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| pageNo | String? | Current page number |   
| pageSize | String? | Page limit |   
| fromDate | String? | From Date |   
| toDate | String? | To Date |   
| q | String? | Keyword for Search |   
| stage | String? | Specefic Order Stage |   
| salesChannels | String? | Selected Sales Channel |   
| orderId | String? | Order Id |   
| stores | String? | Selected Stores |   
| status | String? | Status of order |   
| shortenUrls | Boolean? | Shorten URL option |   
| filterType | String? | Filters |  



Get Orders

*Success Response*



Success


Schema: `OrderListing`





API Error


Schema: `ApefaceApiError`





Internal Server Error


Schema: `ApefaceApiError`






---


#### getOrderDetails
Get Order Details for company based on Company Id and Order Id


```java
order.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| orderId | String? | Order Id |   
| next | String? | Next |   
| previous | String? | Previous |  



Get Orders

*Success Response*



Success


Schema: `OrderDetails`





API Error


Schema: `ApefaceApiError`





Internal Server Error


Schema: `ApefaceApiError`






---


#### getPicklistOrdersByCompanyId
Get Orders for company based on Company Id


```java
order.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| pageNo | String? | Current page number |   
| pageSize | String? | Page limit |   
| fromDate | String? | From Date |   
| toDate | String? | To Date |   
| q | String? | Keyword for Search |   
| stage | String? | Specefic Order Stage |   
| salesChannels | String? | Selected Sales Channel |   
| orderId | String? | Order Id |   
| stores | String? | Selected Stores |   
| status | String? | Status of order |   
| shortenUrls | Boolean? | Shorten URL option |   
| filterType | String? | Filters |  



Get Orders

*Success Response*



Success


Schema: `OrderPicklistListing`





API Error


Schema: `ApefaceApiError`





Internal Server Error


Schema: `ApefaceApiError`






---


#### trackShipmentPlatform
Track Shipment by shipment id, for application based on application Id


```java
order.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| shipmentId | String? | Shipment Id |  



Shipment Track

*Success Response*



Success


Schema: `PlatformShipmentTrack`





API Error


Schema: `ApefaceApiError`





Internal Server Error


Schema: `ApefaceApiError`






---


#### trackOrder
Track Order by order id, for application based on application Id


```java
order.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| orderId | String? | Order Id |  



Order Track

*Success Response*



Success


Schema: `PlatformOrderTrack`





API Error


Schema: `ApefaceApiError`





Internal Server Error


Schema: `ApefaceApiError`






---


#### failedOrders
Get all failed orders application wise


```java
order.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |  



Failed Orders

*Success Response*



Success


Schema: `FailedOrders`





API Error


Schema: `ApefaceApiError`





Internal Server Error


Schema: `ApefaceApiError`






---


#### reprocessOrder
Reprocess order by order id


```java
order.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| orderId | String? | Order Id |  



Order Reprocess

*Success Response*



Success


Schema: `UpdateOrderReprocessResponse`





API Error


Schema: `ApefaceApiError`





Internal Server Error


Schema: `ApefaceApiError`






---


#### updateShipment
Use this API to update the shipment using its shipment ID.


```java
order.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| shipmentId | String? | ID of the shipment. An order may contain multiple items and may get divided into one or more shipment, each having its own ID. |  



Update the shipment

*Success Response*



Success. Check the example shown below or refer `ShipmentUpdateRequest` for more details.


Schema: `ShipmentUpdateResponse`





API Error. See the error object in the response body to know the exact reason.


Schema: `ApefaceApiError`





Internal Server Error. See the error object in the response body to know the exact reason.


Schema: `ApefaceApiError`






---


#### getPlatformShipmentReasons
Use this API to retrieve the issues that led to the cancellation of bags within a shipment.


```java
order.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |  



Get reasons behind full or partial cancellation of a shipment

*Success Response*



Success. Check the example shown below or refer `ShipmentReasonsResponse` for more details.


Schema: `ShipmentReasonsResponse`





API Error. See the error object in the response body to know the exact reason.


Schema: `ApefaceApiError`





Internal Server Error. See the error object in the response body to know the exact reason.


Schema: `ApefaceApiError`






---


#### getShipmentTrackDetails
Use this API to track a shipment using its shipment ID.


```java
order.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| orderId | String? | ID of the order. |   
| shipmentId | String? | ID of the shipment. An order may contain multiple items and may get divided into one or more shipment, each having its own ID. |  



Track shipment

*Success Response*



Success. Check the example shown below or refer `ShipmentTrackResponse` for more details.


Schema: `ShipmentTrackResponse`





API Error. See the error object in the response body to know the exact reason.


Schema: `ApefaceApiError`





Internal Server Error. See the error object in the response body to know the exact reason.


Schema: `ApefaceApiError`






---


#### getShipmentAddress
Use this API to get address of a shipment using its shipment ID and Address Category.


```java
order.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| shipmentId | String? | ID of the shipment. An order may contain multiple items and may get divided into one or more shipment, each having its own ID. |   
| addressCategory | String? | Category of the address it falls into(billing or delivery). |  



Get Shipment Address

*Success Response*



Success. Check the example shown below or refer `GetShipmentAddressResponse` for more details.


Schema: `GetShipmentAddressResponse`





API Error. See the error object in the response body to know the exact reason.


Schema: `ApefaceApiError`





Internal Server Error. See the error object in the response body to know the exact reason.


Schema: `ApefaceApiError`






---


#### updateShipmentAddress
Use this API to update address of a shipment using its shipment ID and Address Category.


```java
order.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| shipmentId | String? | ID of the shipment. An order may contain multiple items and may get divided into one or more shipment, each having its own ID. |   
| addressCategory | String? | Category of the address it falls into(billing or delivery). |  



Update Shipment Address

*Success Response*



Success. Check the example shown below or refer `UpdateShipmentAddressResponse` for more details.


Schema: `UpdateShipmentAddressResponse`





API Error. See the error object in the response body to know the exact reason.


Schema: `ApefaceApiError`





Internal Server Error. See the error object in the response body to know the exact reason.


Schema: `ApefaceApiError`






---


#### getPing
Get Ping


```java
order.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |  



Get Ping

*Success Response*



Success


Schema: `GetPingResponse`





API Error


Schema: `ApefaceApiError`





Internal Server Error


Schema: `ApefaceApiError`






---


#### voiceCallback
Get Voice Callback


```java
order.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |  



Voice Callback

*Success Response*



Success


Schema: `GetVoiceCallbackResponse`





API Error


Schema: `ApefaceApiError`





Internal Server Error


Schema: `ApefaceApiError`






---


#### voiceClickToCall
Get Voice Click to Call


```java
order.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| caller | String? | Caller contact number |   
| receiver | String? | Receiver contact number |  



Voice Click to Call

*Success Response*



Success


Schema: `GetClickToCallResponse`





API Error


Schema: `ApefaceApiError`





Internal Server Error


Schema: `ApefaceApiError`






---



---
---


## Catalog


#### deleteSearchKeywords
Delete a Search Keywords


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String? | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to delete. |  



Delete a keywords by it's id. Returns an object that tells whether the keywords was deleted successfully

*Success Response*



Status object. Tells whether the operation was successful. See example below or refer `DeleteResponse`


Schema: `DeleteResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getSearchKeywords
Get a Search Keywords Details


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String? | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to retrieve. |  



Get the details of a words by its `id`. If successful, returns a Collection resource in the response body specified in `GetSearchWordsDetailResponseSchema`

*Success Response*



The Collection object. See example below or refer `GetSearchWordsDetailResponseSchema` for details


Schema: `GetSearchWordsDetailResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### updateSearchKeywords
Update Search Keyword


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String? | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to delete. |  



Update Search Keyword by its id. On successful request, returns the updated collection

*Success Response*



The Collection object. See example below or refer `GetSearchWordsDataSchema` for details.


Schema: `GetSearchWordsData`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getAllSearchKeyword
List all Search Custom Keyword Listing


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |  



Custom Search Keyword allows you to map conditions with keywords to give you the ultimate results

*Success Response*



List of custom search keywords. See example below or refer `GetSearchWordsResponseSchema` for details


Schema: `GetSearchWordsResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### createCustomKeyword
Add a Custom Search Keywords


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |  



Create a Custom Search Keywords. See `CreateSearchKeywordSchema` for the list of attributes needed to create a mapping and /collections/query-options for the available options to create a rule. On successful request, returns a paginated list of collections specified in `CreateSearchKeywordSchema`

*Success Response*



Get keyword object with id that is added. See example below or refer `GetSearchWordsDataSchema` for details


Schema: `GetSearchWordsData`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### deleteAutocompleteKeyword
Delete a Autocomplete Keywords


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String? | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to delete. |  



Delete a keywords by it's id. Returns an object that tells whether the keywords was deleted successfully

*Success Response*



Status object. Tells whether the operation was successful. See example below or refer `DeleteResponse`


Schema: `DeleteResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getAutocompleteKeywordDetail
Get a Autocomplete Keywords Details


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String? | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to retrieve. |  



Get the details of a words by its `id`. If successful, returns a keywords resource in the response body specified in `GetAutocompleteWordsResponseSchema`

*Success Response*



The mapping object. See example below or refer `GetAutocompleteWordsResponseSchema` for details


Schema: `GetAutocompleteWordsResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### updateAutocompleteKeyword
Create & Update Autocomplete Keyword


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String? | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to delete. |  



Update a mapping by it's id. On successful request, returns the updated Keyword mapping

*Success Response*



The Mapping object. See example below or refer `GetAutocompleteWordsResponseSchema` for details.


Schema: `GetAutocompleteWordsResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getAutocompleteConfig
List all Autocomplete Keyword Listing


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |  



Custom Autocomplete Keyword allows you to map conditions with keywords to give you the ultimate results

*Success Response*



List of custom autocomplete keywords. See example below or refer `GetAutocompleteWordsResponseSchema` for details


Schema: `GetAutocompleteWordsResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### createCustomAutocompleteRule
Add a Custom Autocomplete Keywords


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |  



Create a Custom Autocomplete Keywords. See `CreateAutocompleteKeywordSchema` for the list of attributes needed to create a mapping and /collections/query-options for the available options to create a rule. On successful request, returns a paginated list of collections specified in `CreateAutocompleteKeywordSchema`

*Success Response*



List of all the collections including the one you added. See example below or refer `CreateAutocompleteWordsResponseSchema` for details


Schema: `CreateAutocompleteWordsResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getProductBundle
List all Product Bundles


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| q | String? | A search string that is searched with product bundle name. |  



Get all product bundles for a particular company

*Success Response*



List of bundle configured for a company. See example below or refer `GetProductBundleListingResponse` for details


Schema: `GetProductBundleListingResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### createProductBundle
Create Product Bundle


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |  



Create Product Bundle. See `ProductBundleRequest` for the request body parameter need to create a product bundle. On successful request, returns in `ProductBundleRequest` with id

*Success Response*



Get bundle with id that is added. See example below or refer `GetProductBundleCreateResponse` for details


Schema: `GetProductBundleCreateResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getProductBundleDetail
Get a particular Product Bundle details


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| id | String? | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to retrieve. |  



Get a particular Bundle details by its `id`. If successful, returns a Product bundle resource in the response body specified in `GetProductBundleResponse`

*Success Response*



The Collection object. See example below or refer `GetProductBundleResponse` for details


Schema: `GetProductBundleResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### updateProductBundle
Update a Product Bundle


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| id | String? | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to delete. |  



Update a Product Bundle by its id. On successful request, returns the updated product bundle

*Success Response*



The Collection object. See example below or refer `GetProductBundleCreateResponse` for details.


Schema: `GetProductBundleCreateResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getSizeGuides
Get list of size guides


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Id of the company for which the size guides are to be fetched. |   
| active | Boolean? | filter size guide on basis of active, in-active |   
| q | String? | Query that is to be searched. |   
| tag | String? | to filter size guide on basis of tag. |   
| pageNo | Integer? | The page number to navigate through the given set of results |   
| pageSize | Integer? | Number of items to retrieve in each page. Default is 10. |  



This API allows to view all the size guides associated to the seller.

*Success Response*



Size guide object. See example below or refer `ListSizeGuide` for details


Schema: `ListSizeGuide`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### createSizeGuide
Create a size guide.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Id of the company inside which the size guide is to be created. |  



This API allows to create a size guide associated to a brand.

*Success Response*



Returns a success response


Schema: `SuccessResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getSizeGuide
Get a single size guide.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Id of the company associated to size guide. |   
| id | String? | Id of the size guide to be viewed. |  



This API helps to get data associated to a size guide.

*Success Response*



Brand object. See example below or refer `SizeGuideResponseSchema` for details


Schema: `SizeGuideResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### updateSizeGuide
Edit a size guide.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Id of the company. |   
| id | String? | Mongo id of the size guide to be edited |  



This API allows to edit a size guide.

*Success Response*



Returns a success response


Schema: `SuccessResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getCatalogConfiguration
Get configuration meta  details for catalog for admin panel


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |  



configuration meta  details for catalog.

*Success Response*



configuration details for catalog. See example below or refer `GetCatalogConfigurationMetaDataSchema` for details


Schema: `GetCatalogConfigurationMetaData`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getConfigurations
Get configured details for catalog


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |  



configured details for catalog.

*Success Response*



Get application level configured catalog details. See example below or refer `GetAppCatalogConfigurationSchema` for details


Schema: `GetAppCatalogConfiguration`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### createConfigurationProductListing
Add configuration for products & listings


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |  



Add configuration for products & listing.

*Success Response*



success flag will tell whether the operation was successful.


Schema: `GetAppCatalogConfiguration`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getConfigurationByType
Get configured details for catalog


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| type | String? | type can be brands, categories etc. |  



configured details for catalog.

*Success Response*



Get application level configured catalog details. See example below or refer `GetAppCatalogEntityConfigurationSchema` for details


Schema: `GetAppCatalogEntityConfiguration`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### createConfigurationByType
Add configuration for categories and brands


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| type | String? | type can be brands, categories etc. |  



Add configuration for categories & brands.

*Success Response*



success flag will tell whether the operation was successful.


Schema: `GetAppCatalogConfiguration`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getQueryFilters
Get query filters to configure a collection


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |  



Get query filters to configure a collection

*Success Response*



The attached items of an collection. See example below or refer `GetCollectionQueryOptionResponse` for details


Schema: `GetCollectionQueryOptionResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getAllCollections
List all the collections


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |  



A Collection allows you to organize your products into hierarchical groups. For example, a dress might be in the category _Clothing_, the individual product might also be in the collection _Summer_. On successful request, returns all the collections as specified in `CollectionListingSchema`

*Success Response*



List of collections. See example below or refer `GetCollectionListingResponse` for details


Schema: `GetCollectionListingResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### createCollection
Add a Collection


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |  



Create a collection. See `CreateCollectionRequestSchema` for the list of attributes needed to create a collection and collections/query-options for the available options to create a collection. On successful request, returns a paginated list of collections specified in `CollectionCreateResponse`

*Success Response*



List of all the collections including the one you added. See example below or refer `CollectionCreateResponse` for details


Schema: `CollectionCreateResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getCollectionDetail
Get a particular collection


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| slug | String? | A `slug` is a human readable, URL friendly unique identifier of an object. Pass the `slug` of the collection which you want to retrieve. |  



Get the details of a collection by its `slug`. If successful, returns a Collection resource in the response body specified in `CollectionDetailResponse`

*Success Response*



The Collection object. See example below or refer `CollectionDetailResponse` for details


Schema: `CollectionDetailResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### deleteCollection
Delete a Collection


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String? | A `id` is a unique identifier of a collection. |  



Delete a collection by it's id. Returns an object that tells whether the collection was deleted successfully

*Success Response*



Status object. Tells whether the operation was successful. See example below or refer `DeleteResponse`


Schema: `DeleteResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### updateCollection
Update a collection


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String? | A `id` is a unique identifier of a collection. |  



Update a collection by it's id. On successful request, returns the updated collection

*Success Response*



The Collection object. See example below or refer `UpdateCollectionSchema` for details.


Schema: `UpdateCollection`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getCollectionItems
Get the items for a collection


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String? | A `id` is a unique identifier of a collection. |   
| sortOn | String? | Each response will contain sort_on param, which should be sent back to make pagination work. |   
| pageId | String? | Each response will contain next_id param, which should be sent back to make pagination work. |   
| pageSize | Integer? | Number of items to retrieve in each page. Default is 12. |  



Get items from a collection specified by its `id`.

*Success Response*



The attached items of an collection. See example below or refer `GetCollectionItemsResponseSchema` for details


Schema: `GetCollectionItemsResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### addCollectionItems
Add items to a collection


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String? | A `id` is a unique identifier of a collection. |  



Adds items to a collection specified by its `id`. See `CollectionItemRequest` for the list of attributes needed to add items to an collection.

*Success Response*



Status object. Tells whether the operation was successful.


Schema: `UpdatedResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getCatalogInsights
Analytics data of catalog and inventory.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| brand | String? | Brand slug |  



Catalog Insights api returns the count of catalog related data like products, brands, departments and categories that have been made live as per configuration of the app.

*Success Response*



Response Data


Schema: `CatalogInsightResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getSellerInsights
Analytics data of catalog and inventory that are being cross-selled.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| sellerAppId | String? | Id of the seller application which is serving the invetory/catalog of the company |  



Analytics data of catalog and inventory that are being cross-selled.

*Success Response*



Response Data


Schema: `CrossSellingResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### createMarketplaceOptin
Create/Update opt-in infomation.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | The company id for which the detail needs to be retrieved. |   
| marketplace | String? | The marketplace for which the detail needs to be retrieved. |  



Use this API to create/update opt-in information for given platform. If successful, returns data in the response body as specified in `OptInPostResponseSchema`

*Success Response*



See example below or refer `UpdatedResponse` for details.


Schema: `UpdatedResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getMarketplaceOptinDetail
Get opt-in infomation.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? |  |  



Use this API to fetch opt-in information for all the platforms. If successful, returns a logs in the response body as specified in `GetOptInPlatformSchema`

*Success Response*



See example below or refer `GetOptInPlatformSchema` for details.


Schema: `GetOptInPlatform`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getCompanyDetail
Get the Company details.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | The company id for which the detail needs to be retrieved. |  



Get the details of the company associated with the given company_id passed.

*Success Response*



See example below or refer `OptinCompanyDetailSchema` for details


Schema: `OptinCompanyDetail`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getCompanyBrandDetail
Get the Company Brand details of Optin.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | The company id for which the detail needs to be retrieved. |   
| isActive | Boolean? | The is_active status for the optin id. |   
| q | Boolean? | The search value to filter the list. |   
| pageNo | Integer? | The number of page for the company id. |   
| pageSize | Integer? | Number of records that can be seen on the page for the company id. |   
| marketplace | String? | The marketplace platform associated with the company id. |  



Get the details of the Brands associated with the given company_id passed.

*Success Response*



See example below or refer `OptinCompanyBrandDetailsView` for details


Schema: `OptinCompanyBrandDetailsView`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getCompanyMetrics
Get the Company metrics


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | The company id for which the detail needs to be retrieved. |  



Get the Company metrics associated with the company ID passed.

*Success Response*



See example below or refer `OptinCompanyMetrics` for details


Schema: `OptinCompanyMetrics`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getStoreDetail
Get the Store details.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | The company id for which the detail needs to be retrieved. |   
| q | String? | The search related the store for the company id. |   
| pageNo | Integer? | The number of page for the company id. |   
| pageSize | Integer? | Number of records that can be seen on the page for the company id. |  



Get the details of the store associated with the company ID passed.

*Success Response*



See example below or refer `OptinStoreDetailsSchema` for details


Schema: `OptinStoreDetails`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getGenderAttribute
Get gender attribute details


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | company for which you want to view the genders |   
| attributeSlug | String? | slug of the attribute for which you want to view the genders |  



This API allows to view the gender attribute details.

*Success Response*



Size guide object. See example below or refer `GenderDetailSchema` for details


Schema: `GenderDetail`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### listProductTemplateCategories
List Department specifiec product categories


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| departments | String? | A `department` is name of a departments whose category needs to be listed. Can specify multiple departments. |   
| itemType | String? | An `item_type` is the type of item, it can be `set`, `standard`, `digital`, etc. |  



Allows you to list all product categories values for the departments specified

*Success Response*



List of all categories attached to departments specified. See example below or refer `ProdcutTemplateCategoriesResponse` for details


Schema: `ProdcutTemplateCategoriesResponse`





Bad request. See the error object in the response body for specific reason


Schema: `PTErrorResponse`






---


#### listDepartmentsData
List all Departments


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| pageNo | Integer? | The page number to navigate through the given set of results |   
| pageSize | Integer? | Number of items to retrieve in each page. Default is 10. |   
| name | String? | Can search departments by passing name. |   
| search | String? | Can search departments by passing name of the department in search parameter. |   
| isActive | Boolean? | Can query for departments based on whether they are active or inactive. |  



Allows you to list all departments, also can search using name and filter active and incative departments, and item type

*Success Response*



List of departments data. See example below or refer `DepartmentsResponse` for details


Schema: `DepartmentsResponse`





Bad request. See the error object in the response body for specific reason


Schema: `DepartmentErrorResponse`






---


#### getDepartmentData
Get specific departments details by passing in unique id of the department


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| uid | String? | A `uid` is a unique identifier of a department. |  



Allows you to get department data, by uid

*Success Response*



Departments Data. See example below or refer `DepartmentsResponse` for details


Schema: `DepartmentsResponse`





Bad request. See the error object in the response body for specific reason


Schema: `DepartmentErrorResponse`






---


#### listProductTemplate
List all Templates


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| departments | String? | A `departments` is the name of a particular department. |  



Allows you to list all product templates, also can filter by department

*Success Response*



List of product templates. See example below or refer `TemplatesResponse` for details


Schema: `TemplatesResponse`





Bad request. See the error object in the response body for specific reason


Schema: `PTErrorResponse`






---


#### validateProductTemplate
Validate Product Template Schema


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| slug | String? | A `slug` is a unique identifier for a particular template. |  



Allows you to list all product templates validation values for all the fields present in the database

*Success Response*



List of fields and validation values fro each. See example below or refer `TemplatesValidationResponse` for details


Schema: `TemplatesValidationResponse`





Bad request. See the error object in the response body for specific reason


Schema: `PTErrorResponse`






---


#### downloadProductTemplateViews
Download Product Template View


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| slug | String? | A `slug` is a unique identifier for a particular template. |  



Allows you to download product template data

*Success Response*



CSV File of product template data. See example below or refer `TemplatesResponse` for details


Schema: `String`





Bad request. See the error object in the response body for specific reason


Schema: `PTErrorResponse`






---


#### downloadProductTemplateView
Download Product Template View


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| itemType | String? | An `item_type` defines the type of item. |  



Allows you to download product template data

*Success Response*



CSV File of product template data.


Schema: `String`





Bad request. See the error object in the response body for specific reason


Schema: `PTErrorResponse`






---


#### validateProductTemplateSchema
Validate Product Template Schema


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| itemType | String? | An `item_type` defines the type of item. The default value is standard. |  



Allows you to list all product templates validation values for all the fields present in the database

*Success Response*



List of fields and validation values fro each. See example below or refer `InventoryValidationResponse` for details


Schema: `InventoryValidationResponse`





Bad request. See the error object in the response body for specific reason


Schema: `PTErrorResponse`






---


#### listHSNCodes
List HSN Codes


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |  



Allows you to list all hsn Codes

*Success Response*



List of all HSN Codes. See example below or refer `HSNCodesResponse` for details


Schema: `HSNCodesResponse`





Bad request. See the error object in the response body for specific reason


Schema: `PTErrorResponse`






---


#### listProductTemplateExportDetails
Allows you to list all product templates export list details


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |  



Can view details including trigger data, task id , etc.

*Success Response*



List of Product Downloads Data. See example below or refer `ProductDownloadsResponse` for details


Schema: `ProductDownloadsResponse`





Bad request. See the error object in the response body for specific reason


Schema: `PTErrorResponse`






---


#### listTemplateBrandTypeValues
Allows you to list all values for Templates, Brands or Type


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| filter | String? | A `filter` is the unique identifier of the type of value required. |  



The filter type query parameter defines what type of data to return. The type of query returns the valid values for the same

*Success Response*



See example below or refer `ProductConfigurationDownloadsSchema` for details


Schema: `ProductConfigurationDownloads`





Bad request. See the error object in the response body for specific reason


Schema: `PTErrorResponse`






---


#### listCategories
Get product categories list


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| level | String? | Get category for multiple levels |   
| departments | String? | Get category for multiple departments filtered |   
| q | String? | Get multiple categories filtered by search string |   
| pageNo | Integer? | The page number to navigate through the given set of results |   
| pageSize | Integer? | Number of items to retrieve in each page. Default is 10. |  



This API gets meta associated to product categories.

*Success Response*



Category Meta. See example below or refer `CategoryResponse` for details


Schema: `CategoryResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### createCategories
Create product categories


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |  



This API lets user create product categories

*Success Response*



Category Meta. See example below or refer `CategoryCreateResponse` for details


Schema: `CategoryCreateResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getCategoryData
Get product category by uid


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| uid | String? | Category unique id |  



This API gets meta associated to product categories.

*Success Response*



Get Data for one category. See example below or refer `CategoryResponse` for details


Schema: `SingleCategoryResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### updateCategory
Update product categories


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| uid | String? | Category unique id |  



Update a product category using this apu

*Success Response*



Category Meta. See example below or refer `CategoryUpdateResponse` for details


Schema: `CategoryUpdateResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getProducts
Get product list


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Double? | Get list of products filtered by company Id |   
| brandIds | Double? | Get multiple products filtered by brand Ids |   
| categoryIds | Double? | Get multiple products filtered by category Ids |   
| search | String? | Get multiple products filtered by search string |   
| pageNo | Integer? | The page number to navigate through the given set of results |   
| pageSize | Integer? | Number of items to retrieve in each page. Default is 10. |  



This API gets meta associated to products.

*Success Response*



Product Meta. See example below for details


Schema: `ProductListingResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### createProduct
Create a product.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Id of the company associated to product that is to be viewed. |  



This API allows to create product.

*Success Response*



Returns a success response


Schema: `SuccessResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### deleteProduct
Delete a product.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id of the company associated to product that is to be deleted. |   
| itemId | Integer? | Id of the product to be updated. |  



This API allows to delete product.

*Success Response*



Returns a success response


Schema: `SuccessResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getProduct
Get a single product.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| itemCode | String? | Item code of the product. |   
| companyId | Integer? | Company Id of the product. |   
| itemId | Integer? | Item Id of the product. |   
| brandUid | Integer? | Brand Id of the product. |   
| uid | Integer? | Id of the product. |  



This API helps to get data associated to a particular product.

*Success Response*



Product object. See example below or refer `product.utils.format_product_response` for details


Schema: `Product`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### editProduct
Edit a product.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Id of the company associated to product that is to be viewed. |   
| itemId | Integer? | Id of the product to be updated. |  



This API allows to edit product.

*Success Response*



Returns a success response


Schema: `SuccessResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getProductValidation
Validate product/size data


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Double? | Validates data against given company |  



This API validates product data.

*Success Response*



Validate Meta. See example below for details


Schema: `ValidateProduct`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getProductSize
Get a single product size.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| itemCode | String? | Item code of the product size. |   
| companyId | Integer? | Company Id of the product size. |   
| itemId | Integer? | Item Id of the product size. |   
| brandUid | Integer? | Brand Id of the product size. |   
| uid | Integer? | Id of the product size. |  



This API helps to get data associated to a particular product size.

*Success Response*



Product object. See example below for details


Schema: `ProductListingResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getProductBulkUploadHistory
Get a list of all bulk product upload jobs.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id of of which Product Bulk Upload History to be obtained. |   
| pageNo | Integer? | The page number to navigate through the given set of results |   
| pageSize | Integer? | Number of items to retrieve in each page. Default is 12. |  



This API helps to get bulk product upload jobs data.

*Success Response*



List of bulk product upload jobs. See `BulkRequestGetSchema` for details


Schema: `ProductBulkRequestList`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### updateProductAssetsInBulk
Create a Bulk asset upload Job.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id in which assets to be uploaded. |  



This API helps to create a bulk asset upload job.

*Success Response*



Returns a success response


Schema: `SuccessResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### deleteProductBulkJob
Delete Bulk product job.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id of the company associated to size that is to be deleted. |   
| batchId | Integer? | Batch Id of the bulk product job to be deleted. |  



This API allows to delete bulk product job associated with company.

*Success Response*



Returns a success response


Schema: `SuccessResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### createProductsInBulk
Create products in bulk associated with given batch Id.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id in which assets to be uploaded. |   
| batchId | String? | Batch Id in which assets to be uploaded. |  



This API helps to create products in bulk push to kafka for approval/creation.

*Success Response*



Returns a success response


Schema: `SuccessResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getCompanyTags
Get a list of all tags associated with company.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id of the product size. |  



This API helps to get tags data associated to a particular copmpany.

*Success Response*



Tag List. See example below for details


Schema: `ProductTagsViewResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getProductAssetsInBulk
Get a list of all bulk asset jobs.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id of the product size. |   
| pageNo | Integer? | The page number to navigate through the given set of results |   
| pageSize | Integer? | Number of items to retrieve in each page. Default is 12. |  



This API helps to get bulk asset jobs data associated to a particular company.

*Success Response*



List of bulk asset jobs List. See `BulkUtil.modify_batch_response` for details


Schema: `BulkAssetResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### createProductAssetsInBulk
Create a Bulk asset upload Job.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id in which assets to be uploaded. |  



This API helps to create a bulk asset upload job.

*Success Response*



Returns a success response


Schema: `SuccessResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### deleteSize
Delete a Size associated with product.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id of the company associated to size that is to be deleted. |   
| itemId | Integer? | Item Id of the product associated with size to be deleted. |   
| size | Integer? | size to be deleted. |  



This API allows to delete size associated with product.

*Success Response*



Returns a success response


Schema: `ProductSizeDeleteResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getInventory
Get Inventory for company


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Id of the company associated to product that is to be viewed. |   
| itemId | String? | Item code of the product of which size is to be get. |   
| size | String? | Size of which inventory is to get. |   
| pageNo | Integer? | The page number to navigate through the given set of results |   
| pageSize | Integer? | Number of items to retrieve in each page. Default is 12. |  



This API allows get Inventory data for particular company grouped by size and store.

*Success Response*



returns a list of all inventory grouped by size and store


Schema: `InventoryResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### addInventory
Add Inventory for particular size and store.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Id of the company associated to product that is to be viewed. |   
| itemId | Double? | Item code of the product of which size is to be get. |   
| size | String? | Size in which inventory is to be added. |  



This API allows add Inventory for particular size and store.

*Success Response*



Returns a success response


Schema: `SuccessResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### deleteInventory
Delete a Inventory.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id of the company associated with Inventory that is to be deleted. |   
| itemId | Integer? | Id of the product associated with Inventory to be deleted. |   
| locationId | Double? | Location ID of store of which inventory is to be deleted. |  



This API allows to delete inventory of a particular product for particular company.

*Success Response*



Returns a success response


Schema: `InventoryDelete`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getInventoryBulkUploadHistory
Get a list of all bulk Inventory upload jobs.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id of of which Inventory Bulk Upload History to be obtained. |   
| pageNo | Integer? | The page number to navigate through the given set of results |   
| pageSize | Integer? | Number of items to retrieve in each page. Default is 12. |  



This API helps to get bulk Inventory upload jobs data.

*Success Response*



List of bulk Inventory upload jobs. See `BulkInventoryGetSchema` for details


Schema: `BulkInventoryGet`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### createBulkInventoryJob
Create a Bulk Inventory upload Job.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id in which Inventory to be uploaded. |  



This API helps to create a bulk Inventory upload job.

*Success Response*



Returns a success response


Schema: `CommonResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### deleteBulkInventoryJob
Delete Bulk Inventory job.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id of the company of which bulk Inventory job is to be deleted. |  



This API allows to delete bulk Inventory job associated with company.

*Success Response*



Returns a success response


Schema: `SuccessResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### createBulkInventory
Create products in bulk associated with given batch Id.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id in which Inventory is to be uploaded. |  



This API helps to create products in bulk push to kafka for approval/creation.

*Success Response*



Returns a success response


Schema: `SuccessResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getInventoryExport
Get Inventory export history.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id in which assets to be uploaded. |  



This API helps to get Inventory export history.

*Success Response*



Returns a list of inventory export jobs


Schema: `InventoryExportJob`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### createInventoryExportJob
Create a Inventory export Job.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id in which assets to be uploaded. |  



This API helps to create a Inventory export job.

*Success Response*



Returns a success response


Schema: `SuccessResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### exportInventoryConfig
Get List of different filters for inventory export


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Id of the company associated to product that is to be viewed. |   
| filterType | String? | filter type from any one of ['brand', 'store', 'type'] |  



This API allows get List of different filters like brand, store, and type for inventory export.

*Success Response*



returns filters configuration for inventory export


Schema: `InventoryConfig`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getAllHsnCodes
Hsn Code List.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | company id |   
| pageNo | Integer? | page no |   
| pageSize | Integer? | page size |   
| q | String? | search using hsn code. |  



Hsn Code List.

*Success Response*



List of all HSN Codes. See example below or refer `HsnCodesListingResponseSchema` for details


Schema: `HsnCodesListingResponse`





Bad request.


Schema: `ErrorResponse`






---


#### createHsnCode
Create Hsn Code.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | company id |  



Create Hsn Code.

*Success Response*



See example below for details


Schema: `HsnCode`





Bad request.


Schema: `ErrorResponse`






---


#### getHsnCode
Fetch Hsn Code.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | company id |   
| id | String? | Unique id |  



Fetch Hsn Code.

*Success Response*



See example below details


Schema: `HsnCode`





Bad request.


Schema: `ErrorResponse`






---


#### updateHsnCode
Update Hsn Code.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | company id |   
| id | String? | Unique id |  



Update Hsn Code.

*Success Response*



See example below for details


Schema: `HsnCode`





Bad request.


Schema: `ErrorResponse`






---


#### bulkHsnCode
Bulk Create or Update Hsn Code.


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | company id |  



Bulk Create or Update Hsn Code.

*Success Response*



See example below for details


Schema: `BulkHsnResponse`





Bad request.


Schema: `ErrorResponse`






---


#### getApplicationBrands
List all the brands


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| department | String? | The name of the department. Use this parameter to filter products by a particular department. See below the list of available departments. You can retrieve available departments from the **v1.0/departments/** API |   
| pageNo | Integer? | The page number to navigate through the given set of results |   
| pageSize | Integer? | Number of items to retrieve in each page. Default is 12. |  



A brand is the name under which a product is being sold. Use this API to list all the brands. You can pass optionally filter the brands by the department. If successful, returns a paginated list of brands specified in `BrandListingResponse`

*Success Response*



List of Brands. See example below or refer `BrandListingResponse` for details


Schema: `BrandListingResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getDepartments
List all the departments


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |  



Departments are a way to categorise similar products. A product can lie in multiple departments. For example, a skirt can below to the 'Women's Fashion' Department while a handbag can lie in 'Women's Accessories' Department. Use this API to list all the departments. If successful, returns the list of departments specified in `DepartmentResponse`

*Success Response*



List of Departments. See example below or refer `DepartmentResponse` for details.


Schema: `DepartmentResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getCategories
List all the categories


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| department | String? | The name of the department. Use this parameter to filter products by a particular department. See below the list of available departments. You can retrieve available departments from the **v1.0/departments/** API |  



List all the categories. You can optionally pass filter the brands by the department. If successful, returns a paginated list of brands specified in `CategoryListingResponse`

*Success Response*



List of Categories. See example below or refer `CategoryListingResponse` for details.


Schema: `CategoryListingResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getAppicationProducts
List the products


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| q | String? | The search query. This can be a partial or complete name of a either a product, brand or category |   
| f | String? | The search filter parameters. All the parameter filtered from filter parameters will be passed in **f** parameter in this format. **?f=brand:voi-jeans||and:::category:t-shirts||shirts** |   
| filters | Boolean? | Pass `filters` parameter to fetch the filter details. This flag is used to fetch all filters |   
| sortOn | String? | The order to sort the list of products on. The supported sort parameters are popularity, price, redemption and discount in either ascending or descending order. See the supported values below. |   
| pageId | String? | Each response will contain **page_id** param, which should be sent back to make pagination work. |   
| pageSize | Integer? | Number of items to retrieve in each page. Default is 12. |   
| pageNo | Integer? | If page_type is number then pass it to fetch page items. Default is 1. |   
| pageType | String? | For pagination type should be cursor or number. Default is cursor. |  



List all the products associated with a brand, collection or category in a requested sort order. The API additionally supports arbitrary search queries that may refer the name of any product, brand, category or collection. If successful, returns a paginated list of products specified in `ApplicationProductListingResponse`

*Success Response*



List of Products. See example below or refer `ApplicationProductListingResponse` for details


Schema: `ApplicationProductListingResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getProductDetailBySlug
Get a product


```java
catalog.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| slug | String? | The unique identifier of a product. i.e; `slug` of a product. You can retrieve these from the APIs that list products like **v1.0/products/** |  



Products are the core resource of an application. Products can be associated by categories, collections, brands and more. This API retrieves the product specified by the given **slug**. If successful, returns a Product resource in the response body specified in `ProductDetail`

*Success Response*



The Product object. See example below or refer `ProductDetail` for details.


Schema: `ProductDetail`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---



---
---


## CompanyProfile


#### cbsOnboardGet
Get company profile


```java
companyprofile.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |  



This API allows to view the company profile of the seller account.

*Success Response*



Company profile object. See example below or refer `GetCompanyProfileSerializerResponse` for details


Schema: `GetCompanyProfileSerializerResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### updateCompany
Edit company profile


```java
companyprofile.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |  



This API allows to edit the company profile of the seller account.

*Success Response*



Returns a success message


Schema: `SuccessResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getCompanyMetrics
Get company metrics


```java
companyprofile.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |  



This API allows to view the company metrics, i.e. the status of its brand and stores. Also its allows to view the number of products, company documents & store documents which are verified and unverified.

*Success Response*



Metrics response object. See example below or refer `MetricsSerializer` for details


Schema: `MetricsSerializer`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### editBrand
Edit a brand.


```java
companyprofile.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Id of the company associated to brand that is to be viewed. |   
| brandId | String? | Id of the brand to be viewed. |  



This API allows to edit meta of a brand.

*Success Response*



Returns a success response


Schema: `SuccessResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getBrand
Get a single brand.


```java
companyprofile.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Id of the company associated to brand that is to be viewed. |   
| brandId | String? | Id of the brand to be viewed. |  



This API helps to get data associated to a particular brand.

*Success Response*



Brand object. See example below or refer `GetBrandResponseSerializer` for details


Schema: `GetBrandResponseSerializer`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### createBrand
Create a Brand.


```java
companyprofile.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Id of the company. |  



This API allows to create a brand associated to a company.

*Success Response*



Returns a success response


Schema: `SuccessResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getBrands
Get brands associated to a company


```java
companyprofile.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Id of the company. |   
| pageNo | Integer? | The page number to navigate through the given set of results |   
| pageSize | Integer? | Number of items to retrieve in each page. Default is 10. |  



This API helps to get view brands associated to a particular company.

*Success Response*



Brand object. See example below or refer `CompanyBrandListSerializer` for details


Schema: `CompanyBrandListSerializer`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### createCompanyBrandMapping
Create a company brand mapping.


```java
companyprofile.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Id of the company inside which the brand is to be mapped. |  



This API allows to create a company brand mapping, for a already existing brand in the system.

*Success Response*



Returns a success response


Schema: `SuccessResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getLocations
Get list of locations


```java
companyprofile.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Id of the company whose locations are to fetched |   
| storeType | String? | Helps to sort the location list on the basis of location type. |   
| q | String? | Query that is to be searched. |   
| stage | String? | to filter companies on basis of verified or unverified companies. |   
| pageNo | Integer? | The page number to navigate through the given set of results |   
| pageSize | Integer? | Number of items to retrieve in each page. Default is 10. |  



This API allows to view all the locations asscoiated to a company.

*Success Response*



Company profile object. See example below or refer `LocationListSerializer` for details


Schema: `LocationListSerializer`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### createLocation
Create a location asscoiated to a company.


```java
companyprofile.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Id of the company inside which the location is to be created. |  



This API allows to create a location associated to a company.

*Success Response*



Returns a success response


Schema: `SuccessResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### updateLocation
Edit a location asscoiated to a company.


```java
companyprofile.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Id of the company inside which the location is to be created. |   
| locationId | String? | Id of the location which you want to edit. |  



This API allows to edit a location associated to a company.

*Success Response*



Returns a success response


Schema: `SuccessResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getLocationDetail
Get details of a specific location.


```java
companyprofile.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Id of the company inside which the location lies. |   
| locationId | String? | Id of the location which you want to view. |  



This API helps to get data associated to a specific location.

*Success Response*



Brand object. See example below or refer `GetLocationSerializer` for details


Schema: `GetLocationSerializer`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### createLocationBulk
Create a location asscoiated to a company in bulk.


```java
companyprofile.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Id of the company inside which the location is to be created. |  



This API allows to create a location associated to a company.

*Success Response*



Returns a success response


Schema: `SuccessResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---



---
---


## FileStorage


#### startUpload
This operation initiates upload and returns storage link which is valid for 30 Minutes. You can use that storage link to make subsequent upload request with file buffer or blob.


```java
filestorage.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| namespace | String? | bucket name |   
| companyId | Integer? | company_id |  



Uploads an arbitrarily sized buffer or blob.

It has three Major Steps:
* Start
* Upload
* Complete

### Start
Initiates the assets upload using `startUpload`.
It returns the storage link in response.

### Upload
Use the storage link to upload a file (Buffer or Blob) to the File Storage.
Make a `PUT` request on storage link received from `startUpload` api with file (Buffer or Blob) as a request body.

### Complete
After successfully upload, call `completeUpload` api to complete the upload process.
This operation will return the url for the uploaded file.


*Success Response*



Success


Schema: `StartResponse`





Failed


Schema: `FailedResponse`






---


#### completeUpload
This will complete the upload process. After successfully uploading file, you can call this operation to complete the upload process.


```java
filestorage.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| namespace | String? | bucket name |   
| companyId | Integer? | company_id |  



Uploads an arbitrarily sized buffer or blob.

It has three Major Steps:
* Start
* Upload
* Complete

### Start
Initiates the assets upload using `startUpload`.
It returns the storage link in response.

### Upload
Use the storage link to upload a file (Buffer or Blob) to the File Storage.
Make a `PUT` request on storage link received from `startUpload` api with file (Buffer or Blob) as a request body.

### Complete
After successfully upload, call `completeUpload` api to complete the upload process.
This operation will return the url for the uploaded file.


*Success Response*



Success


Schema: `CompleteResponse`





Failed


Schema: `FailedResponse`






---


#### appStartUpload
This operation initiates upload and returns storage link which is valid for 30 Minutes. You can use that storage link to make subsequent upload request with file buffer or blob.


```java
filestorage.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| namespace | String? | bucket name |   
| companyId | Integer? | company_id |   
| applicationId | String? | application id |  



Uploads an arbitrarily sized buffer or blob.

It has three Major Steps:
* Start
* Upload
* Complete

### Start
Initiates the assets upload using `appStartUpload`.
It returns the storage link in response.

### Upload
Use the storage link to upload a file (Buffer or Blob) to the File Storage.
Make a `PUT` request on storage link received from `appStartUpload` api with file (Buffer or Blob) as a request body.

### Complete
After successfully upload, call `appCompleteUpload` api to complete the upload process.
This operation will return the url for the uploaded file.


*Success Response*



Success


Schema: `StartResponse`





Failed


Schema: `FailedResponse`






---


#### appCompleteUpload
This will complete the upload process. After successfully uploading file, you can call this operation to complete the upload process.


```java
filestorage.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| namespace | String? | bucket name |   
| companyId | Integer? | company_id |   
| applicationId | String? | application id |  



Uploads an arbitrarily sized buffer or blob.

It has three Major Steps:
* Start
* Upload
* Complete

### Start
Initiates the assets upload using `appStartUpload`.
It returns the storage link in response.

### Upload
Use the storage link to upload a file (Buffer or Blob) to the File Storage.
Make a `PUT` request on storage link received from `appStartUpload` api with file (Buffer or Blob) as a request body.

### Complete
After successfully upload, call `appCompleteUpload` api to complete the upload process.
This operation will return the url for the uploaded file.


*Success Response*



Success


Schema: `CompleteResponse`





Failed


Schema: `FailedResponse`






---


#### getSignUrls
Explain here


```java
filestorage.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | company_id |  



Describe here

*Success Response*



Success


Schema: `SignUrlResponse`





Failed


Schema: `FailedResponse`






---


#### copyFiles
Copy Files


```java
filestorage.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| sync | Boolean? | sync |   
| companyId | Integer? | company_id |  



Copy Files

*Success Response*



Success


Schema: `BulkResponse`





Failed


Schema: `FailedResponse`






---


#### appCopyFiles
Copy Files


```java
filestorage.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| sync | Boolean? | sync |   
| companyId | Integer? | company_id |   
| applicationId | Integer? | application_id |  



Copy Files

*Success Response*



Success


Schema: `BulkResponse`





Failed


Schema: `FailedResponse`






---


#### browse
Browse Files


```java
filestorage.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| namespace | String? | bucket name |   
| companyId | Integer? | company_id |   
| pageNo | Integer? | page no |  



Browse Files

*Success Response*



Success


Schema: `BrowseResponse`





Failed


Schema: `FailedResponse`






---


#### browse
Browse Files


```java
filestorage.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| namespace | String? | bucket name |   
| companyId | Integer? | company_id |   
| applicationId | Integer? | application_id |   
| pageNo | Integer? | page no |  



Browse Files

*Success Response*



Success


Schema: `BrowseResponse`





Failed


Schema: `FailedResponse`






---


#### proxy
Proxy


```java
filestorage.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | company_id |   
| url | String? | url |  



Proxy

*Success Response*



Success


Schema: `String`






---



---
---


## Share


#### createShortLink
Create short link


```java
share.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |  



Create short link

*Success Response*



Success


Schema: `ShortLinkRes`





Error


Schema: `ErrorRes`






---


#### getShortLinks
Get short links


```java
share.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| pageNo | Integer? | Current page number |   
| pageSize | Integer? | Current page size |   
| createdBy | String? | Short link creator |   
| active | String? | Short link active status |   
| q | String? | Search text for original and short url |  



Get short links

*Success Response*



Success


Schema: `ShortLinkList`





Error


Schema: `ErrorRes`






---


#### getShortLinkByHash
Get short link by hash


```java
share.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| hash | String? | Hash of short url |  



Get short link by hash

*Success Response*



Success


Schema: `ShortLinkRes`





Error


Schema: `ErrorRes`






---


#### updateShortLinkById
Update short link by id


```java
share.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| id | String? | Short link document identifier |  



Update short link by id

*Success Response*



Success


Schema: `ShortLinkRes`





Error


Schema: `ErrorRes`






---



---
---


## Inventory


#### getJobsByCompany
Get Job Configs For A Company


```java
inventory.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |   
| pageNo | Integer? | Page Number |   
| pageSize | Integer? | Page Size |  



REST Endpoint that returns all job configs for a company

*Success Response*



Successful operation


Schema: `ResponseEnvelopeListJobConfigRawDTO`





Bad Request


Schema: `ResponseEnvelopeListJobConfigRawDTO`





Internal Server Error


Schema: `ResponseEnvelopeListJobConfigRawDTO`






---


#### updateJob
Updates An Existing Job Config


```java
inventory.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |   
| xUserData | String? |  |  



REST Endpoint that updates a job config

*Success Response*



Job Config Updated Successfully


Schema: `ResponseEnvelopeString`





Bad Request


Schema: `ResponseEnvelopeString`





Unauthorized


Schema: `ResponseEnvelopeString`





Internal Server Error


Schema: `ResponseEnvelopeString`






---


#### createJob
Creates A New Job Config


```java
inventory.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |   
| xUserData | String? |  |  



REST Endpoint that creates a new job config

*Success Response*



Job Config Created Successfully


Schema: `ResponseEnvelopeString`





Bad Request


Schema: `ResponseEnvelopeString`





Unauthorized


Schema: `ResponseEnvelopeString`





Job Config Already Exists


Schema: `ResponseEnvelopeString`





Internal Server Error


Schema: `ResponseEnvelopeString`






---


#### getJobByCompanyAndIntegration
Get Job Configs By Company And Integration


```java
inventory.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |   
| integrationId | String? | Integration Id |   
| pageNo | Integer? | Page Number |   
| pageSize | Integer? | Page Size |  



REST Endpoint that returns all job configs by company And integration

*Success Response*



Successful operation


Schema: `ResponseEnvelopeListJobConfigDTO`





Bad Request


Schema: `ResponseEnvelopeListJobConfigDTO`





Internal Server Error


Schema: `ResponseEnvelopeListJobConfigDTO`






---


#### getJobConfigDefaults
Get Job Configs Defaults


```java
inventory.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |  



REST Endpoint that returns default fields job configs by company And integration

*Success Response*



Successful operation


Schema: `ResponseEnvelopeJobConfigDTO`





Bad Request


Schema: `ResponseEnvelopeJobConfigDTO`





Internal Server Error


Schema: `ResponseEnvelopeJobConfigDTO`






---


#### getJobByCode
Get Job Config By Code


```java
inventory.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |   
| code | String? | Job Code |  



REST Endpoint that returns job config by code

*Success Response*



Successful operation


Schema: `ResponseEnvelopeJobConfigDTO`





Bad Request


Schema: `ResponseEnvelopeJobConfigDTO`





Internal Server Error


Schema: `ResponseEnvelopeJobConfigDTO`






---


#### getJobCodesByCompanyAndIntegration
Get Job Codes By Company And Integration


```java
inventory.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | Company Id |   
| integrationId | String? | Integration Id |   
| pageNo | Integer? | Page Number |   
| pageSize | Integer? | Page Size |  



REST Endpoint that returns all job codes by company And integration

*Success Response*



Successful operation


Schema: `ResponseEnvelopeListJobConfigListDTO`





Bad Request


Schema: `ResponseEnvelopeListJobConfigListDTO`





Internal Server Error


Schema: `ResponseEnvelopeListJobConfigListDTO`






---



---
---


## Configuration


#### getBuildConfig
Get latest build config


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |   
| platformType | String? | Current platform name |  



Get latest build config

*Success Response*



Success


Schema: `MobileAppConfiguration`






---


#### updateBuildConfig
Update build config for next build


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |   
| platformType | String? | Current platform name |  



Update build config for next build

*Success Response*



Success


Schema: `MobileAppConfiguration`






---


#### getPreviousVersions
Get previous build versions


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |   
| platformType | String? | Current platform name |  



Get previous build versions

*Success Response*



Success


Schema: `BuildVersionHistory`






---


#### getAppFeatures
Get features of application


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Get features of application

*Success Response*



Success


Schema: `AppFeatureResponse`





Not found


Schema: `NotFound`






---


#### updateAppFeatures
Update features of application


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Update features of application

*Success Response*



Success


Schema: `AppFeature`






---


#### getAppBasicDetails
Get basic application details


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Get basic application details like name

*Success Response*



Success


Schema: `ApplicationDetail`






---


#### updateAppBasicDetails
Add or update application's basic details


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Add or update application's basic details

*Success Response*



Success


Schema: `ApplicationDetail`






---


#### getAppContactInfo
Get application information


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Get Application Current Information. This includes information about social links, address and contact information of company/seller/brand of the application.

*Success Response*



Success


Schema: `ApplicationInformation`






---


#### updateAppContactInfo
Get application information


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Save Application Current Information. This includes information about social links, address and contact information of an application.

*Success Response*



Success


Schema: `ApplicationInformation`






---


#### getAppApiTokens
Get social tokens


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Get social tokens.

*Success Response*



Success


Schema: `TokenResponse`






---


#### updateAppApiTokens
Add social tokens


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Add social tokens.

*Success Response*



Success


Schema: `TokenResponse`






---


#### getAppCompanies
Application inventory enabled companies


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |   
| pageNo | Integer? | Current page no |   
| pageSize | Integer? | Current request items count |  



Application inventory enabled companies.

*Success Response*



Success


Schema: `CompaniesResponse`






---


#### getAppStores
Application inventory enabled stores


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |   
| pageNo | Integer? | Current page no |   
| pageSize | Integer? | Current request items count |  



Application inventory enabled stores.

*Success Response*



Success


Schema: `StoresResponse`






---


#### getInventoryConfig
Get application configuration


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Get application configuration for various features and data

*Success Response*



Success


Schema: `ApplicationInventory`






---


#### updateInventoryConfig
Update application configuration


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Update application configuration for various features and data

*Success Response*



Success


Schema: `ApplicationInventory`






---


#### partiallyUpdateInventoryConfig
Partially update application configuration


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Partially update application configuration for various features and data

*Success Response*



Success


Schema: `ApplicationInventory`






---


#### getAppCurrencyConfig
Get application enabled currency list


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Get application enabled currency list

*Success Response*



Success


Schema: `AppSupportedCurrency`






---


#### updateAppCurrencyConfig
Add initial application supported currency


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Add initial application supported currency for various features and data. Default INR will be enabled.

*Success Response*



Success


Schema: `AppSupportedCurrency`






---


#### getOrderingStoresByFilter
Get ordering store by filter


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |   
| pageNo | Integer? | Current page no |   
| pageSize | Integer? | Current request items count |  



Get ordering store by filter

*Success Response*



Success


Schema: `OrderingStores`






---


#### updateOrderingStoreConfig
Add/Update ordering store config


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Add/Update ordering store config.

*Success Response*



Success


Schema: `DeploymentMeta`





Invalid/Missing params


Schema: `InvalidPayloadRequest`






---


#### getDomains
Get attached domain list


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Get attached domain list.

*Success Response*



Success


Schema: `DomainsResponse`






---


#### addDomain
Add new domain to application


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Add new domain to application.

*Success Response*



Success


Schema: `Domain`





Invalid/Missing params


Schema: `InvalidPayloadRequest`






---


#### removeDomainById
Remove attached domain


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |   
| id | String? | Domain _id |  



Remove attached domain.

*Success Response*



Success


Schema: `SuccessMessageResponse`





Invalid request or Missing params


Schema: `InvalidPayloadRequest`





Invalid/Missing params


Schema: `NotFound`






---


#### changeDomainType
Change domain type


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Change a domain to Primary or Shortlink domain

*Success Response*



Success


Schema: `DomainsResponse`





Invalid/Missing params


Schema: `NotFound`






---


#### getDomainStatus
Get domain connected status.


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Get domain connected status. Check if domain is live and mapped to appropriate IP to fynd servers.

*Success Response*



Success


Schema: `DomainStatusResponse`






---


#### createApplication
Create application


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |  



Create new application

*Success Response*



Success


Schema: `CreateAppResponse`






---


#### getApplications
Get list of application under company


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| pageNo | Integer? |  |   
| pageSize | Integer? |  |   
| q | String? | Url encoded object used as mongodb query |  



Get list of application under company

*Success Response*



Success


Schema: `ApplicationsResponse`






---


#### getApplicationById
Get application data from id


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Get application data from id

*Success Response*



Success


Schema: `Application`






---


#### getCurrencies
Get all currencies


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |  



Get all currencies

*Success Response*



Currencies Success response


Schema: `CurrenciesResponse`






---


#### getDomainAvailibility
Check domain availibility before linking to application


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |  



Check domain availibility before linking to application. Also sends domain suggestions with similar to queried domain. \ Custom domain search is currently powered by GoDaddy provider.

*Success Response*



Success


Schema: `DomainSuggestionsResponse`






---


#### getIntegrationById
Get integration data


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| id | Integer? | Integration id |  



Get integration data

*Success Response*



Success


Schema: `Integration`






---


#### getAvailableOptIns
Get all available integration opt-ins


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| pageNo | Integer? | Current page no |   
| pageSize | Integer? | Current request items count |  



Get all available integration opt-ins

*Success Response*



Success


Schema: `GetIntegrationsOptInsResponse`






---


#### getSelectedOptIns
Get company/store level integration opt-ins


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| level | String? | Integration level |   
| uid | Integer? | Integration level uid |   
| pageNo | Integer? | Current page no |   
| pageSize | Integer? | Current request items count |  



Get company/store level integration opt-ins

*Success Response*



Success


Schema: `GetIntegrationsOptInsResponse`






---


#### getIntegrationLevelConfig
Get integration level config


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| id | String? | Integration id |   
| level | String? | Integration level |   
| opted | Boolean? | Filter on opted stores |   
| checkPermission | Boolean? | Filter on if permissions are present |  



Get integration level config

*Success Response*



Success


Schema: `IntegrationConfigResponse`






---


#### getIntegrationByLevelId
Get level data for integration


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| id | String? | Integration id |   
| level | String? | Integration level |   
| uid | Integer? | Integration level uid |  



Get level data for integration

*Success Response*



Success


Schema: `IntegrationLevel`






---


#### getLevelActiveIntegrations
Check store has active integration


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| id | String? | Integration id |   
| level | String? | Integration level |   
| uid | Integer? | Integration level uid |  



API checks if a store is already opted in any other integrations

*Success Response*



Success


Schema: `OptedStoreIntegration`






---


#### getBrandsByCompany
Get brands by company


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| q | String? | Search text for brand name |  



Get brands by company

*Success Response*



Success


Schema: `BrandsByCompanyResponse`






---


#### getCompanyByBrands
Get company by brand uids


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| pageNo | Integer? | Current page no |   
| pageSize | Integer? | Current request items count |  



Get company by brand uids

*Success Response*



Success


Schema: `CompanyByBrandsResponse`






---


#### getStoreByBrands
Get stores by brand uids


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| pageNo | Integer? | Current page no |   
| pageSize | Integer? | Current request items count |  



Get stores by brand uids

*Success Response*



Success


Schema: `StoreByBrandsResponse`






---


#### getOtherSellerApplications
Get other seller applications


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| pageNo | Integer? | Current page no |   
| pageSize | Integer? | Current request items count |  



Get other seller applications who has opted current company as inventory

*Success Response*



Success


Schema: `OtherSellerApplications`






---


#### getOtherSellerApplicationById
Get other seller applications


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| id | String? | Application Id |  



Get other seller application

*Success Response*



Success


Schema: `OptedApplicationResponse`





Not found


Schema: `NotFound`






---


#### optOutFromApplication
Opt out company or store from other seller application


```java
configuration.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| id | String? | Application Id |  



Opt out company or store from other seller application

*Success Response*



Success


Schema: `SuccessMessageResponse`





Invalid params or Not configured inventory


Schema: `InvalidPayloadRequest`





Not found


Schema: `NotFound`






---



---
---


## Cart


#### getCoupons
Get with single coupon details or coupon list


```java
cart.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current Application _id |   
| pageNo | Integer? |  |   
| pageSize | Integer? |  |   
| isArchived | Boolean? |  |   
| title | String? |  |   
| isPublic | Boolean? |  |   
| isDisplay | Boolean? |  |   
| typeSlug | String? |  |   
| code | String? |  |  



Get coupon list with pagination

*Success Response*



Coupon List for sent page_size and page_no


Schema: `CouponsResponse`






---


#### createCoupon
Create new coupon


```java
cart.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current Application _id |  



Create new coupon

*Success Response*



Coupon Created successfully


Schema: `SuccessMessage`





Invalid coupon data or existing coupon code


Schema: `OperationErrorResponse`






---


#### getCouponById
Get with single coupon details or coupon list


```java
cart.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current Application _id |   
| id | String? |  |  



Get single coupon details with `id` in path param

*Success Response*



Coupon object for sent `id`


Schema: `CouponUpdate`





Coupon not found for passed `id`


Schema: `OperationErrorResponse`






---


#### updateCoupon
Update existing coupon configuration


```java
cart.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current Application _id |   
| id | String? |  |  



Update coupon with id sent in `id`

*Success Response*



Coupon updated successfully


Schema: `SuccessMessage`





Coupon not found for `id` from path params


Schema: `OperationErrorResponse`






---


#### updateCouponPartially
Update coupon archive state and schedule


```java
cart.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current Application _id |   
| id | String? |  |  



Update archive/unarchive and change schedule for coupon

*Success Response*



Coupon updated successfully


Schema: `SuccessMessage`





Coupon not found for `id` from path params


Schema: `OperationErrorResponse`






---



---
---


## Rewards


#### getGiveaways
List of giveaways of the current application.


```java
rewards.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | company id |   
| applicationId | String? | application id |   
| pageId | String? | pagination page id |   
| pageSize | Integer? | pagination page size |  



List of giveaways of the current application.

*Success Response*



ok


Schema: `GiveawayResponse`





Bad request


Schema: `E`






---


#### createGiveaway
Adds a new giveaway.


```java
rewards.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | company id |   
| applicationId | String? | application id |  



Adds a new giveaway.

*Success Response*



ok


Schema: `Giveaway`





Bad request


Schema: `E`






---


#### getGiveawayByID
Get giveaway by ID.


```java
rewards.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | company id |   
| applicationId | String? | application id |   
| id | String? | Giveaway ID |  



Get giveaway by ID.

*Success Response*



ok


Schema: `Giveaway`





Bad request


Schema: `E`






---


#### updateGiveaway
Updates the giveaway by it's ID.


```java
rewards.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | company id |   
| applicationId | String? | application id |   
| id | String? | Giveaway ID |  



Updates the giveaway by it's ID.

*Success Response*



ok


Schema: `Giveaway`





Bad request


Schema: `E`






---


#### getOffers
List of offer of the current application.


```java
rewards.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | company id |   
| applicationId | String? | application id |  



List of offer of the current application.

*Success Response*



ok


Schema: `List<Offer>`





Bad request


Schema: `E`






---


#### getOfferByName
Get offer by name.


```java
rewards.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | company id |   
| applicationId | String? | application id |   
| cookie | String? | User's session cookie. This cookie is set in browser cookie when logged-in to fynd's authentication system i.e. `Grimlock` or by using grimlock-backend SDK for backend implementation. |   
| name | String? | Offer name |  



Get offer by name.

*Success Response*



ok


Schema: `Offer`





Bad request


Schema: `E`






---


#### updateOfferByName
Updates the offer by name.


```java
rewards.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | company id |   
| applicationId | String? | application id |   
| name | String? | Offer name |  



Updates the offer by name.

*Success Response*



ok


Schema: `Offer`





Bad request


Schema: `E`






---


#### getUserAvailablePoints
User's reward details.


```java
rewards.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | company id |   
| applicationId | String? | application id |   
| userId | String? | user id |  



User's reward details.

*Success Response*



ok


Schema: `UserRes`





Bad request


Schema: `E`






---


#### updateUserStatus
Update User status


```java
rewards.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | company id |   
| applicationId | String? | application id |   
| userId | String? | user id |  



Update user status, active/archive

*Success Response*



Success


Schema: `AppUser`





Bad Request


Schema: `E`






---


#### getUserPointsHistory
Get list of points transactions.


```java
rewards.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | company id |   
| applicationId | String? | application id |   
| userId | String? | user id |   
| pageId | String? | PageID is the ID of the requested page. For first request it should be kept empty. |   
| pageLimit | Integer? | PageLimit is the number of requested items in response. |   
| pageSize | Integer? | PageSize is the number of requested items in response. |  



Get list of points transactions.
The list of points history is paginated.

*Success Response*



ok


Schema: `HistoryRes`





Bad request


Schema: `E`






---



---
---


## Analytics


#### getStatiscticsGroups
Get statistics groups


```java
analytics.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |  



Get statistics groups

*Success Response*



Success


Schema: `StatsGroups`





Error


Schema: `ErrorRes`






---


#### getStatiscticsGroupComponents
Get statistics group components


```java
analytics.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| groupName | String? | Group name |  



Get statistics group components

*Success Response*



Success


Schema: `StatsGroupComponents`





Error


Schema: `ErrorRes`






---


#### getComponentStatsCSV
Get component statistics csv


```java
analytics.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| componentName | String? | Component name |  



Get component statistics csv

*Success Response*



Success


Schema: `String`





Error


Schema: `ErrorRes`






---


#### getComponentStatsPDF
Get component statistics pdf


```java
analytics.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| componentName | String? | Component name |  



Get component statistics pdf

*Success Response*



Success


Schema: `String`





Error


Schema: `ErrorRes`






---


#### getComponentStats
Get component statistics


```java
analytics.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| componentName | String? | Component name |  



Get component statistics

*Success Response*



Success


Schema: `StatsRes`





Error


Schema: `ErrorRes`






---


#### getAbandonCartList
Get abandon carts list


```java
analytics.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| fromDate | String? | From date |   
| toDate | String? | To date |   
| pageNo | Integer? | Current page number |   
| pageSize | Integer? | Current page size |  



Get abandon carts list

*Success Response*



Success


Schema: `AbandonCartsList`





Error


Schema: `ErrorRes`






---


#### getAbandonCartsCSV
Get abandon carts csv


```java
analytics.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| fromDate | String? | From date |   
| toDate | String? | To date |  



Get abandon carts csv

*Success Response*



Success


Schema: `String`





Error


Schema: `ErrorRes`






---


#### getAbandonCartDetail
Get abandon carts details


```java
analytics.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| cartId | String? | Cart Id |  



Get abandon cart details

*Success Response*



Success


Schema: `AbandonCartDetail`






---


#### createExportJob
Create data export job in required format


```java
analytics.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| exportType | String? | Export type / format |  



Create data export job in required format

*Success Response*



Success


Schema: `ExportJobRes`






---


#### getExportJobStatus
Get data export job status


```java
analytics.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| exportType | String? | Export type / format |   
| jobId | String? | Export job id |  



Get data export job status

*Success Response*



Success


Schema: `ExportJobStatusRes`






---


#### getLogsList
Get logs list


```java
analytics.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| logType | String? | Log type |   
| pageNo | Integer? | Current page number |   
| pageSize | Integer? | Current page size |  



Get logs list

*Success Response*



Success


Schema: `GetLogsListRes`






---


#### searchLogs
Search logs


```java
analytics.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| pageNo | Integer? | Current page number |   
| pageSize | Integer? | Current page size |   
| logType | String? | Log type |  



Search logs

*Success Response*



Success


Schema: `SearchLogRes`






---



---
---


## Discount


#### getDiscounts
Fetch discount list.


```java
discount.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | company_id |   
| view | String? | listing or calender.  Default is listing. |   
| q | String? | The search query. This can be a partial or complete name of a discount. |   
| pageNo | Integer? | page number. Default is 1. |   
| pageSize | Integer? | page size. Default is 12. |   
| archived | Boolean? | archived. Default is false. |   
| month | Integer? | month. Default is current month. |   
| year | Integer? | year. Default is current year. |   
| type | String? | basic or custom. |   
| appIds | List<String>? | application ids. |  



Fetch discount list.

*Success Response*



Success


Schema: `ListOrCalender`





Failed


Schema: `BadRequestObject`






---


#### createDiscount
Create Discount.


```java
discount.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | company_id |  



Create Discount.

*Success Response*



Success


Schema: `DiscountJob`





Failed


Schema: `BadRequestObject`






---


#### getDiscount
Fetch discount.


```java
discount.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | company_id |   
| id | String? | unique id. |  



Fetch discount.

*Success Response*



Success


Schema: `DiscountJob`





Failed


Schema: `BadRequestObject`






---


#### updateDiscount
Create Discount.


```java
discount.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | company_id |   
| id | String? | id |  



Create Discount.

*Success Response*



Success


Schema: `DiscountJob`





Failed


Schema: `BadRequestObject`






---


#### validateDiscountFile
Validate File.


```java
discount.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | company_id |   
| discount | String? | discount |  



Validate File.

*Success Response*



Success


Schema: `FileJobResponse`





Failed


Schema: `BadRequestObject`






---


#### downloadDiscountFile
Validate File.


```java
discount.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | company_id |   
| type | String? | type |  



Validate File.

*Success Response*



Success


Schema: `FileJobResponse`





Failed


Schema: `BadRequestObject`






---


#### getValidationJob
Validate File Job.


```java
discount.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | company_id |   
| id | String? | id |  



Validate File Job.

*Success Response*



Success


Schema: `FileJobResponse`





Failed


Schema: `BadRequestObject`






---


#### cancelValidationJob
Cancel Validation Job.


```java
discount.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | company_id |   
| id | String? | id |  



Cancel Validation Job.

*Success Response*



Success


Schema: `CancelJobResponse`





Failed


Schema: `BadRequestObject`






---


#### getDownloadJob
Download File Job.


```java
discount.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | company_id |   
| id | String? | id |  



Download File Job.

*Success Response*



Success


Schema: `FileJobResponse`





Failed


Schema: `BadRequestObject`






---


#### cancelDownloadJob
Cancel Download Job.


```java
discount.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Integer? | company_id |   
| id | String? | id |  



Cancel Download Job.

*Success Response*



Success


Schema: `CancelJobResponse`





Failed


Schema: `BadRequestObject`






---



---
---


## Partner


#### addProxyPath
Add proxy path for external url


```java
partner.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |   
| extensionId | String? | Extension id |  



Add proxy path for external url

*Success Response*



Success


Schema: `AddProxyResponse`





Duplicate proxy path


Schema: `ApiError`






---


#### removeProxyPath
Remove proxy path for external url


```java
partner.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |   
| extensionId | String? | Extension id |   
| attachedPath | String? | Attachaed path slug |  



Remove proxy path for external url

*Success Response*



Success


Schema: `RemoveProxyResponse`





Entry not found attached path


Schema: `ApiError`






---



---
---


## Webhook


#### getSubscribersByCompanyAndEventId
Get Subscribers By Company And Event


```java
webhook.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| pageNo | Integer? | Page Number |   
| pageSize | Integer? | Page Size |   
| companyId | String? | Company ID of the application |   
| eventId | Integer? | Event Id of the application |  



Get Subscribers By Company And Event

*Success Response*



Success


Schema: `SubscriberConfigList`






---


#### registerSubscriberToEvent
Register Subscriber


```java
webhook.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id of the application |  



Register Subscriber

*Success Response*



Success


Schema: `SubscriberConfig`






---


#### updateSubscriberConfig
Update Subscriber


```java
webhook.(
  
  );
  //use response
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID of the application |  



Update Subscriber

*Success Response*



Success


Schema: `SubscriberConfig`






---



---
---
