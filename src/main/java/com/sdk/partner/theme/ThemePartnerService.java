package com.sdk.partner.theme;

import com.sdk.common.*;
import com.sdk.common.model.FDKException;
import com.sdk.common.model.FDKServerResponseError;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.partner.*;


public class ThemePartnerService {
    private PartnerConfig partnerConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String organizationId;

    private ThemePartnerApiList themePartnerApiList;

    public ThemePartnerService(PartnerConfig partnerConfig) {
        this.partnerConfig = partnerConfig;
        this.retrofitServiceFactory = partnerConfig.getRetrofitServiceFactory();
        this.organizationId = this.partnerConfig.getOrganizationId();
        this.themePartnerApiList = retrofitServiceFactory.getService(ThemePartnerApiList.class);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ThemePartnerModels.MarketplaceThemeSchema getOrganizationThemes(String status, Integer pageSize, Integer pageNo) throws FDKServerResponseError, FDKException {
        return this.getOrganizationThemes(status, pageSize, pageNo, new HashMap<>());
    }

    public ThemePartnerModels.MarketplaceThemeSchema getOrganizationThemes(String status, Integer pageSize, Integer pageNo, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<ThemePartnerModels.MarketplaceThemeSchema> response = null;
            try {
                response = themePartnerApiList.getOrganizationThemes(this.organizationId, status, pageSize, pageNo, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ThemePartnerModels.MarketplaceTheme getOrganizationThemeDetails(String themeId) throws FDKServerResponseError, FDKException {
        return this.getOrganizationThemeDetails(themeId, new HashMap<>());
    }

    public ThemePartnerModels.MarketplaceTheme getOrganizationThemeDetails(String themeId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<ThemePartnerModels.MarketplaceTheme> response = null;
            try {
                response = themePartnerApiList.getOrganizationThemeDetails(this.organizationId, themeId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ThemePartnerModels.MarketplaceTheme updateDraftTheme(String themeId, ThemePartnerModels.MarketplaceTheme body) throws FDKServerResponseError, FDKException {
        return this.updateDraftTheme(themeId, body, new HashMap<>());
    }

    public ThemePartnerModels.MarketplaceTheme updateDraftTheme(String themeId, ThemePartnerModels.MarketplaceTheme body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<ThemePartnerModels.MarketplaceTheme> response = null;
            try {
                response = themePartnerApiList.updateDraftTheme(this.organizationId, themeId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ThemePartnerModels.MarketplaceTheme submitOrganizationTheme(String themeId, ThemePartnerModels.MarketplaceTheme body) throws FDKServerResponseError, FDKException {
        return this.submitOrganizationTheme(themeId, body, new HashMap<>());
    }

    public ThemePartnerModels.MarketplaceTheme submitOrganizationTheme(String themeId, ThemePartnerModels.MarketplaceTheme body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<ThemePartnerModels.MarketplaceTheme> response = null;
            try {
                response = themePartnerApiList.submitOrganizationTheme(this.organizationId, themeId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ThemePartnerModels.MarketplaceTheme deleteOrganizationTheme(String themeId) throws FDKServerResponseError, FDKException {
        return this.deleteOrganizationTheme(themeId, new HashMap<>());
    }

    public ThemePartnerModels.MarketplaceTheme deleteOrganizationTheme(String themeId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<ThemePartnerModels.MarketplaceTheme> response = null;
            try {
                response = themePartnerApiList.deleteOrganizationTheme(this.organizationId, themeId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public List<ThemePartnerModels.MarketplaceTheme> getLatestVersionOfThemeBySlug(String slugName) throws FDKServerResponseError, FDKException {
        return this.getLatestVersionOfThemeBySlug(slugName, new HashMap<>());
    }

    public List<ThemePartnerModels.MarketplaceTheme> getLatestVersionOfThemeBySlug(String slugName, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<List<ThemePartnerModels.MarketplaceTheme>> response = null;
            try {
                response = themePartnerApiList.getLatestVersionOfThemeBySlug(this.organizationId, slugName, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ThemePartnerModels.MarketplaceTheme createNewThemeInOrganization(String slug, ThemePartnerModels.MarketplaceTheme body) throws FDKServerResponseError, FDKException {
        return this.createNewThemeInOrganization(slug, body, new HashMap<>());
    }

    public ThemePartnerModels.MarketplaceTheme createNewThemeInOrganization(String slug, ThemePartnerModels.MarketplaceTheme body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<ThemePartnerModels.MarketplaceTheme> response = null;
            try {
                response = themePartnerApiList.createNewThemeInOrganization(this.organizationId, slug, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ThemePartnerModels.ExtensionSectionDraft createExtensionSectionDraft(String extensionId, ThemePartnerModels.DraftExtensionSection body) throws FDKServerResponseError, FDKException {
        return this.createExtensionSectionDraft(extensionId, body, new HashMap<>());
    }

    public ThemePartnerModels.ExtensionSectionDraft createExtensionSectionDraft(String extensionId, ThemePartnerModels.DraftExtensionSection body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<ThemePartnerModels.ExtensionSectionDraft> response = null;
            try {
                response = themePartnerApiList.createExtensionSectionDraft(this.organizationId, extensionId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ThemePartnerModels.ExtensionSectionPublish publishExtensionSections(String extensionId, ThemePartnerModels.PublishExtensionSection body) throws FDKServerResponseError, FDKException {
        return this.publishExtensionSections(extensionId, body, new HashMap<>());
    }

    public ThemePartnerModels.ExtensionSectionPublish publishExtensionSections(String extensionId, ThemePartnerModels.PublishExtensionSection body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<ThemePartnerModels.ExtensionSectionPublish> response = null;
            try {
                response = themePartnerApiList.publishExtensionSections(this.organizationId, extensionId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ThemePartnerModels.ExtensionPreview applyExtensionPreview(String extensionSectionId, ThemePartnerModels.PreviewExtension body) throws FDKServerResponseError, FDKException {
        return this.applyExtensionPreview(extensionSectionId, body, new HashMap<>());
    }

    public ThemePartnerModels.ExtensionPreview applyExtensionPreview(String extensionSectionId, ThemePartnerModels.PreviewExtension body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<ThemePartnerModels.ExtensionPreview> response = null;
            try {
                response = themePartnerApiList.applyExtensionPreview(this.organizationId, extensionSectionId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ThemePartnerModels.ExtensionPreview removeExtensionPreview(String extensionSectionId, ThemePartnerModels.PreviewExtension body) throws FDKServerResponseError, FDKException {
        return this.removeExtensionPreview(extensionSectionId, body, new HashMap<>());
    }

    public ThemePartnerModels.ExtensionPreview removeExtensionPreview(String extensionSectionId, ThemePartnerModels.PreviewExtension body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<ThemePartnerModels.ExtensionPreview> response = null;
            try {
                response = themePartnerApiList.removeExtensionPreview(this.organizationId, extensionSectionId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ThemePartnerModels.ThemeRejectionReasons getThemeRejectionReasons(String themeId) throws FDKServerResponseError, FDKException {
        return this.getThemeRejectionReasons(themeId, new HashMap<>());
    }

    public ThemePartnerModels.ThemeRejectionReasons getThemeRejectionReasons(String themeId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<ThemePartnerModels.ThemeRejectionReasons> response = null;
            try {
                response = themePartnerApiList.getThemeRejectionReasons(this.organizationId, themeId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ThemePartnerModels.MarketplaceThemeSchema getThemeVersions(String themeSlug, Integer pageSize, Integer pageNo) throws FDKServerResponseError, FDKException {
        return this.getThemeVersions(themeSlug, pageSize, pageNo, new HashMap<>());
    }

    public ThemePartnerModels.MarketplaceThemeSchema getThemeVersions(String themeSlug, Integer pageSize, Integer pageNo, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<ThemePartnerModels.MarketplaceThemeSchema> response = null;
            try {
                response = themePartnerApiList.getThemeVersions(this.organizationId, themeSlug, pageSize, pageNo, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    


private interface Fields {
    String UNKNOWN_ERROR = "Unknown error";
}

}