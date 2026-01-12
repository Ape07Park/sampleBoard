import type { NextConfig } from "next";

const API_BASE_URL = process.env.NEXT_PUBLIC_API_BASE_URL;

const nextConfig: NextConfig = {
  /* config options here */

    async rewrites() {
        return [
            {
                source: "/api/v1/:path*/",
                destination: `${API_BASE_URL}/api/v1/:path*/`
            },
        ];
    },

};

export default nextConfig;
